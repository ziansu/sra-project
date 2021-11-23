public android.graphics.Bitmap getIcon() {
    java.lang.String icon = options.optString("icon", "icon");
    android.graphics.Bitmap bmp = null;
    android.net.Uri iconUri = null;
    try {
        iconUri = android.net.Uri.parse(options.optString("iconUri"));
        bmp = getIconFromUri(iconUri);
    } catch (java.lang.Exception e) {
        bmp = getIconFromRes(icon);
    }
    return bmp;
}