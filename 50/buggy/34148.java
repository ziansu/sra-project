@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    com.github.dfa.diaspora_android.util.AppLog.i(this, "onConfigurationChanged()");
    super.onConfigurationChanged(newConfig);
    setContentView(R.layout.main__activity);
    com.github.dfa.diaspora_android.util.AppLog.v(this, "Rebuild the UI");
    setupUI(null);
}