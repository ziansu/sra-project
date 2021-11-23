private int dpToPx(int dp) {
    return ((int) (android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, getResources().getDisplayMetrics())));
}