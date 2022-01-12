@java.lang.Override
public void onSubAliasStatus(final android.content.Context context, final com.meizu.cloud.pushsdk.platform.message.SubAliasStatus subAliasStatus) {
    com.jiang.android.push.utils.L.i("onSubAliasStatus");
    if ((com.jiang.android.push.flyme.FlymeReceiver.mPushInterface) != null) {
        com.jiang.android.push.utils.JHandler.handler().post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                com.jiang.android.push.utils.L.i("sadasdaddd");
                com.jiang.android.push.flyme.FlymeReceiver.mPushInterface.onAlias(context, subAliasStatus.getAlias());
            }
        });
    }else {
        com.jiang.android.push.utils.L.i("callback is null");
    }
}