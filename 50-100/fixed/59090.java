@java.lang.Override
public void onRegisterStatus(final android.content.Context context, final com.meizu.cloud.pushsdk.platform.message.RegisterStatus registerStatus) {
    if ((com.jiang.android.push.flyme.FlymeReceiver.mPushInterface) != null) {
        com.jiang.android.push.utils.JHandler.handler().post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                com.jiang.android.push.flyme.FlymeReceiver.mPushInterface.onRegister(context, registerStatus.getPushId());
            }
        });
    }else {
        com.jiang.android.push.utils.L.i("callback is null");
    }
}