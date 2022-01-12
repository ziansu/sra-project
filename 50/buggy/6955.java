@java.lang.Override
public void onDidLoadView() {
    com.android.debug.hv.ViewServer.get(this).addWindow(this);
    setFullScreen();
    initMenu();
    initContentView();
    refreshListDataFromNet();
}