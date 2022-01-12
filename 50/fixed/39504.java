@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.jbl.browser.JBLApplication.getInstance().quit();
}