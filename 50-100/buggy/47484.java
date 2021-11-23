public static void invisibleViews(android.view.View... views) {
    for (final android.view.View view : views) {
        view.animate().alpha(0).setDuration(200).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).withEndAction(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                view.setVisibility(View.INVISIBLE);
            }
        });
    }
}