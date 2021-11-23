@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    com.zzzmode.appopsx.ui.core.LangHelper.updateLanguage(getApplicationContext());
    super.onCreate(savedInstanceState);
    android.support.v7.app.AppCompatDelegate.setDefaultNightMode(com.zzzmode.appopsx.ui.core.SpHelper.getThemeMode(this));
}