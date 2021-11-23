@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    int themeMode = com.zzzmode.appopsx.ui.core.SpHelper.getThemeMode(this);
    if (themeMode != (android.support.v7.app.AppCompatDelegate.MODE_NIGHT_AUTO)) {
        android.support.v7.app.AppCompatDelegate.setDefaultNightMode(themeMode);
    }
}