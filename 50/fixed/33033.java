private java.lang.Integer getPXWithDP(java.lang.Integer dp) {
    if (dp == null) {
        return null;
    }
    return ((int) (android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics())));
}