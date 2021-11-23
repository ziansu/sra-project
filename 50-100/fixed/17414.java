public void show() {
    if (!(isAnimationRunning)) {
        expand(contentLayout);
        isAnimationRunning = true;
        new android.os.Handler().postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                isAnimationRunning = false;
            }
        }, duration);
    }
}