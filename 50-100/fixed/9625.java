@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String link = downloadFile.getText().toString();
    intent = new android.content.Intent(ctx, com.dirtyunicorns.duupdater2.services.DownloadService.class);
    intent.putExtra("url", link);
    intent.putExtra("fileName", fileName.getText());
    ctx.startService(intent);
}