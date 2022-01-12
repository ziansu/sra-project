private int getScaledMinScalingSpan() {
    final android.content.res.Resources res = mAppContext.getResources();
    int id = R.dimen.config_min_scaling_span;
    try {
        return res.getDimensionPixelSize(id);
    } catch (android.content.res.Resources e) {
        assert false : "MinScalingSpan resource lookup failed.";
        return ((int) (android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_MM, org.chromium.ui.gfx.ViewConfigurationHelper.MIN_SCALING_SPAN_MM, res.getDisplayMetrics())));
    }
}