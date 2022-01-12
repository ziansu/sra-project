@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    if (((intent != null) && ((intent.getExtras()) != null)) && ((intent.getExtras().getString("nid")) != null)) {
        com.vidinoti.android.vdarsdk.VDARSDKController.getInstance().processNotification(intent.getExtras().getString("nid"), intent.getExtras().getBoolean("remote"));
    }
}