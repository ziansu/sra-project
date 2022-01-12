private void invalidateView(float x, float y) {
    android.util.DisplayMetrics metrics = new android.util.DisplayMetrics();
    windowManager.getDefaultDisplay().getMetrics(metrics);
    params.width = 0;
    params.height = 0;
    params.x = ((int) (x));
    params.y = ((int) (y));
    params.alpha = 0.0F;
    try {
        windowManager.updateViewLayout(sv, params);
    } catch (java.lang.IllegalArgumentException e) {
    }
}