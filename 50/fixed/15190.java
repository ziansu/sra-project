@java.lang.Override
public android.graphics.Bitmap getDefaultVideoPoster() {
    if ((mActivity) == null) {
        return null;
    }
    final android.content.res.Resources resources = mActivity.getResources();
    return android.graphics.BitmapFactory.decodeResource(resources, android.R.drawable.spinner_background);
}