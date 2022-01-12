private boolean hasSoftKeys() {
    boolean hasSoftwareKeys = true;
    android.view.Display d = getWindowManager().getDefaultDisplay();
    android.util.DisplayMetrics realDisplayMetrics = new android.util.DisplayMetrics();
    d.getRealMetrics(realDisplayMetrics);
    int realHeight = realDisplayMetrics.heightPixels;
    int realWidth = realDisplayMetrics.widthPixels;
    android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
    d.getMetrics(displayMetrics);
    int displayHeight = displayMetrics.heightPixels;
    int displayWidth = displayMetrics.widthPixels;
    hasSoftwareKeys = ((realWidth - displayWidth) > 0) || ((realHeight - displayHeight) > 0);
    return hasSoftwareKeys;
}