@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String link = downloadFile.getText().toString();
    intent = new android.content.Intent(ctx, com.dirtyunicorns.duupdater2.services.DownloadService.class);
    intent.putExtra("url", link);
    intent.putExtra("fileName", fileName.getText());
    java.lang.Thread startService = new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            ctx.startService(intent);
        }
    });
    startService.start();
}