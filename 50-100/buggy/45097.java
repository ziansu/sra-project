public void fixLayout() {
    if (org.telegram.android.AndroidUtilities.isTablet()) {
        final android.view.ViewTreeObserver obs = actionBarLayout.getViewTreeObserver();
        obs.addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {
            @java.lang.Override
            public void onGlobalLayout() {
                needLayout();
                if ((Build.VERSION.SDK_INT) < 16) {
                    obs.removeGlobalOnLayoutListener(this);
                }else {
                    obs.removeOnGlobalLayoutListener(this);
                }
            }
        });
    }
}