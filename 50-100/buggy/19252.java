@java.lang.Override
public void onUnRegisterStatus(final android.content.Context context, com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus unRegisterStatus) {
    com.jiang.android.push.utils.L.i("onUnRegisterStatus");
    if ((com.jiang.android.push.flyme.FlymeReceiver.mPushInterface) != null) {
        com.jiang.android.push.utils.JHandler.handler().post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                com.jiang.android.push.flyme.FlymeReceiver.mPushInterface.onUnRegister(context);
            }
        });
    }else {
        com.jiang.android.push.utils.L.i("callback is null");
    }
}