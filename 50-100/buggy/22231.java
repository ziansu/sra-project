@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    super.init();
    com.avos.avoscloud.AVOSCloud.initialize(this, "g3c0zyqrpiy9hp2tuz0ef91lemg5pnepooxyk4cvezgk031i", "ouwmlg6xxq4p4k04g8t6rsx2r3lih9fnr2o2hodkrzbn34yt");
    com.avos.avoscloud.PushService.setDefaultPushCallback(this, com.sealink.huoyuntong.CordovaApp.class);
    com.avos.avoscloud.AVInstallation.getCurrentInstallation().saveInBackground();
    com.avos.avoscloud.AVAnalytics.trackAppOpened(getIntent());
    loadUrl(launchUrl);
}