private float pxToDp(float px) {
    android.util.DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
    return px * (displayMetrics.density);
}