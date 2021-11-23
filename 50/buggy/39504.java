@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    this.unbindService(this.serviceConnection);
    com.jbl.browser.JBLApplication.getInstance().quit();
}