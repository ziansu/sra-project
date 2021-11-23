@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.dxyh.fqrtmpplayer.FQRtmpPusher.CLEAR_SCREEN_DELAY :
            {
                mActivity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                break;
            }
        case com.dxyh.fqrtmpplayer.FQRtmpPusher.FIRST_TIME_INIT :
            {
                initializeFirstTime();
                break;
            }
        case com.dxyh.fqrtmpplayer.FQRtmpPusher.SET_CAMERA_PARAMETERS_WHEN_IDLE :
            {
                setCameraParametersWhenIdle(0);
                break;
            }
        case com.dxyh.fqrtmpplayer.FQRtmpPusher.AUTO_FOCUS :
            {
                mFocusState = com.dxyh.fqrtmpplayer.FQRtmpPusher.FOCUSING;
                mCameraDevice.autoFocus(mAutoFocusCallback);
                break;
            }
    }
}