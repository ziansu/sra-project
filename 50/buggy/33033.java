private int getPXWithDP(java.lang.Integer dp) {
    if (dp == null) {
        return 0;
    }
    return ((int) (android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics())));
}