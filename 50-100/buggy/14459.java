@java.lang.Override
public java.io.InputStream getBody() {
    android.content.res.Resources resources = mContext.getResources();
    try {
        return resources.getAssets().open(url.substring(ASSETS_BASE.length()));
    } catch (java.io.IOException e) {
        return new java.io.ByteArrayInputStream(new byte[0]);
    }
}