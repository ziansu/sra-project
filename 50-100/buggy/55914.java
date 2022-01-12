public static void visibleViews(long duration, android.view.View... views) {
    for (android.view.View view : views) {
        view.setVisibility(View.VISIBLE);
        view.animate().alpha(1).setDuration(duration).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
    }
}