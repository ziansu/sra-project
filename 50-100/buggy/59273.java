public static float getAppBarSize() {
    final android.content.res.TypedArray styledAttributes = com.softdesign.devintensive.utils.App.get().getTheme().obtainStyledAttributes(new int[]{ android.R.attr.actionBarSize });
    float mActionBarSize = styledAttributes.getDimension(0, 0);
    styledAttributes.recycle();
    return mActionBarSize;
}