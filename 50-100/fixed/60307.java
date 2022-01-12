@android.annotation.SuppressLint(value = "NewApi")
public static void updateImmersiveMode() {
    if ((android.os.Build.VERSION.SDK_INT) >= 19) {
        try {
            instance.getWindow().getDecorView().setSystemUiVisibility(0);
        } catch (java.lang.Exception e) {
            com.watabou.pixeldungeon.PixelDungeon.reportException(e);
        }
    }
}