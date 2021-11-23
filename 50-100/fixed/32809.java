@java.lang.Override
public void onRegister(final android.content.Context context, final java.lang.String pushid) {
    com.jiang.android.push.utils.L.i(("onRegister called pushId: " + pushid));
    if ((com.jiang.android.push.flyme.FlymeReceiver.mPushInterface) != null) {
        com.jiang.android.push.utils.JHandler.handler().post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                com.jiang.android.push.flyme.FlymeReceiver.mPushInterface.onRegister(context, pushid);
            }
        });
    }
}