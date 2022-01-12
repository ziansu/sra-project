public void setParameters(android.content.Context context, java.lang.String url, android.widget.ImageView imageView) {
    this.imageView = imageView;
    context.registerReceiver(imageReceivedConfirmerReceiver, new android.content.IntentFilter(com.readyo.app.network_data.ImageFactory.IMAGE));
    this.url = url;
    intentService = new android.content.Intent(context, com.readyo.app.network_data.ReceiveImageService.class);
    intentService.putExtra("URL", url);
    context.startService(intentService);
    context.bindService(intentService, receiveImageServiceConnection, Context.BIND_AUTO_CREATE);
}