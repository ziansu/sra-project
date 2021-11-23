private float pxToDp(float px) {
    final android.util.DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
    return px * (displayMetrics.density);
}