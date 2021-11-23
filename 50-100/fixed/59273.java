public static float getAppBarSize(android.content.Context context) {
    final android.content.res.TypedArray styledAttributes = context.getTheme().obtainStyledAttributes(new int[]{ android.R.attr.actionBarSize });
    float mActionBarSize = styledAttributes.getDimension(0, 0);
    styledAttributes.recycle();
    return mActionBarSize;
}