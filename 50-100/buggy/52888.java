public static void visibleViews(android.view.View... views) {
    for (android.view.View view : views) {
        view.setVisibility(View.VISIBLE);
        view.animate().alpha(1).setDuration(200).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
    }
}