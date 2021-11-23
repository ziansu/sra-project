@java.lang.Override
public void onPushStatus(android.content.Context context, com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus pushSwitchStatus) {
    android.util.Log.i(com.jiang.android.push.flyme.FlymeReceiver.TAG, ("onPushStatus: " + (pushSwitchStatus.toString())));
}