public static void invisibleViews(long duration, android.view.View... views) {
    for (final android.view.View view : views) {
        if (view == null)
            continue;
        
        view.animate().alpha(0).setDuration(duration).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).withEndAction(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                view.setVisibility(View.INVISIBLE);
            }
        });
    }
}