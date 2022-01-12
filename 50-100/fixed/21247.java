private void invalidateView(float x, float y) {
    android.util.DisplayMetrics metrics = new android.util.DisplayMetrics();
    windowManager.getDefaultDisplay().getMetrics(metrics);
    params.width = 1;
    params.height = 1;
    params.x = ((int) (x));
    params.y = ((int) (y));
    params.alpha = 1;
    try {
        windowManager.updateViewLayout(sv, params);
    } catch (java.lang.IllegalArgumentException e) {
    }
}