@java.lang.Override
public void onCreate() {
    super.onCreate();
    de.markusfisch.android.shadereditor.app.ShaderEditorApplication.preferences.init(this);
    de.markusfisch.android.shadereditor.app.ShaderEditorApplication.dataSource.openAsync(this);
    if (de.markusfisch.android.shadereditor.BuildConfig.DEBUG) {
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
        android.os.StrictMode.setVmPolicy(new android.os.StrictMode.VmPolicy.Builder().detectLeakedSqlLiteObjects().detectLeakedClosableObjects().penaltyLog().penaltyDeath().build());
    }
}