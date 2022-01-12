public static void updateUi(int msg) {
    switch (msg) {
        case app.park.com.bluetooth.Constants.MESSAGE_BT_CONNECTED :
            if ((app.park.com.MainActivity.mDeviceRole) == (app.park.com.MainActivity.ROLE_CONTROLLER)) {
                app.park.com.MainActivity.mVideoFragment.enableButton();
            }else {
                if (app.park.com.MainActivity.DBG) {
                    android.util.Log.d(app.park.com.MainActivity.TAG, "Device role is viewer");
                }
                app.park.com.MainActivity.mMainInstatnce.startVideoView();
            }
            break;
        case app.park.com.bluetooth.Constants.MESSAGE_BT_DISCONNECTED :
        default :
            app.park.com.MainActivity.mVideoFragment.disableButton();
            break;
    }
}