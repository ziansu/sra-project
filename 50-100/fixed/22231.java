@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    super.init();
    com.avos.avoscloud.PushService.setDefaultPushCallback(this, com.sealink.huoyuntong.CordovaApp.class);
    com.avos.avoscloud.AVInstallation.getCurrentInstallation().saveInBackground();
    com.avos.avoscloud.AVAnalytics.trackAppOpened(getIntent());
    loadUrl(launchUrl);
}