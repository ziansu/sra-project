@java.lang.Override
public void onCreate() {
    net.nashlegend.sourcewall.App.application = this;
    if (net.nashlegend.sourcewall.util.PrefsUtil.readBoolean(Consts.Key_Is_Night_Mode, false)) {
        android.support.v7.app.AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
    }else {
        android.support.v7.app.AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }
    super.onCreate();
    com.squareup.leakcanary.LeakCanary.install(this);
    net.nashlegend.sourcewall.App.initImageLoader(this);
}