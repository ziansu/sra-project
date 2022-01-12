@java.lang.Override
protected void onStart() {
    super.onStart();
    extra.Log.i(io.fusionbit.vcarry.ActivityHome.TAG, "HOME ACTIVITY ON START");
    if ((serviceResultReceiver) == null) {
        serviceResultReceiver = new io.fusionbit.vcarry.ActivityHome.ServiceResultReceiver(null);
    }
    android.content.Intent transportRequestHandlerService = new android.content.Intent(this, io.fusionbit.vcarry.TransportRequestHandlerService.class);
    transportRequestHandlerService.putExtra(Constants.SERVICE_RESULT_RECEIVER, serviceResultReceiver);
    startService(transportRequestHandlerService);
    bindService(transportRequestHandlerService, mServiceConnection, io.fusionbit.vcarry.BIND_AUTO_CREATE);
}