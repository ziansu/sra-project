public void post(java.lang.Runnable r, java.lang.Object token) {
    if ((mJSHandler) == null) {
        return ;
    }
    android.os.Message m = android.os.Message.obtain(mJSHandler, com.taobao.weex.common.WXThread.secure(r));
    m.obj = token;
    m.sendToTarget();
}