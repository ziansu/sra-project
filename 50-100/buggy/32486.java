@java.lang.Override
public void onUnRegister(final android.content.Context context, boolean b) {
    com.jiang.android.push.utils.L.i("onUnRegister called");
    if (b == true) {
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
}