@java.lang.Override
public void onDestroy() {
    com.erpdevelopment.vbvm.service.DownloadAllService.stopped = false;
    super.onDestroy();
}