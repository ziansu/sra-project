@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.android.server.power.Notifier.MSG_USER_ACTIVITY :
            sendUserActivity();
            break;
        case com.android.server.power.Notifier.MSG_BROADCAST :
            sendNextBroadcast();
            break;
        case com.android.server.power.Notifier.MSG_WIRELESS_CHARGING_STARTED :
        case com.android.server.power.Notifier.MSG_WIRED_CHARGING_STARTED :
            playWirelessChargingStartedSound();
            break;
        case com.android.server.power.Notifier.MSG_SCREEN_BRIGHTNESS_BOOST_CHANGED :
            sendBrightnessBoostChangedBroadcast();
            break;
    }
}