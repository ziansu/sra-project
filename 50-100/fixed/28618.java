public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    com.taobao.weex.bridge.WXModuleManager.onActivityResult(getInstanceId(), requestCode, resultCode, data);
    if ((mRootComp) != null) {
        mRootComp.onActivityResult(requestCode, resultCode, data);
    }else {
        com.taobao.weex.utils.WXLogUtils.w("Warning :Component tree has not build completely, onActivityResult can not be call!");
    }
}