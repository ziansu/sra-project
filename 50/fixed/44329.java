@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.mobilesolutionworks.android.app.ActivityControllerHost.MSG_REALLY_STOPPED :
            if (mStopped) {
            }
            break;
        default :
            super.handleMessage(msg);
    }
}