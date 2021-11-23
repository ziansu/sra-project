@java.lang.Override
protected void onPause() {
    super.onPause();
    if (isFinishing()) {
        cn.bit.hao.ble.tool.application.App.getInstance().exitApp();
    }
}