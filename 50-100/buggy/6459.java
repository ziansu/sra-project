private int getItemHeight() {
    if ((mRowHeight) == 0) {
        android.util.TypedValue value = new android.util.TypedValue();
        android.util.DisplayMetrics metrics = new android.util.DisplayMetrics();
        mContext.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, value, true);
        ((android.view.WindowManager) (mContext.getSystemService(Context.WINDOW_SERVICE))).getDefaultDisplay().getMetrics(metrics);
        mRowHeight = ((int) (android.util.TypedValue.complexToDimension(value.data, metrics)));
    }
    return mRowHeight;
}