@java.lang.Override
public void run() {
    if (bHandshakeResponse) {
        if ((com.freerdp.freerdpcore.presentation.FiwoServerSetting.mHandler) != null) {
            android.os.Message msg1 = new android.os.Message();
            msg1.what = com.freerdp.freerdpcore.utils.appdefine.MSG_CONNECT_RESPONSE;
            com.freerdp.freerdpcore.presentation.FiwoServerSetting.mHandler.sendMessage(msg1);
        }
    }else {
        if ((com.freerdp.freerdpcore.presentation.FiwoServerSetting.mHandler) != null) {
            android.os.Message msg1 = new android.os.Message();
            msg1.what = com.freerdp.freerdpcore.utils.appdefine.MSG_CONNECT_NON_RESPONSE;
            com.freerdp.freerdpcore.presentation.FiwoServerSetting.mHandler.sendMessage(msg1);
        }
    }
    (com.freerdp.freerdpcore.presentation.FiwoServerSetting.count)++;
}