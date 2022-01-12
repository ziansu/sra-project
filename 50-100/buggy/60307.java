@android.annotation.SuppressLint(value = "NewApi")
public static void updateImmersiveMode() {
    if ((android.os.Build.VERSION.SDK_INT) >= 19) {
        try {
            instance.getWindow().getDecorView().setSystemUiVisibility((com.watabou.pixeldungeon.PixelDungeon.immersed() ? (((((android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)) | (android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_FULLSCREEN)) | (android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) : 0));
        } catch (java.lang.Exception e) {
            com.watabou.pixeldungeon.PixelDungeon.reportException(e);
        }
    }
}