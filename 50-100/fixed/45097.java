public void fixLayout() {
    if (org.telegram.android.AndroidUtilities.isTablet()) {
        actionBarLayout.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {
            @java.lang.Override
            public void onGlobalLayout() {
                needLayout();
                if ((actionBarLayout) != null) {
                    if ((Build.VERSION.SDK_INT) < 16) {
                        actionBarLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }else {
                        actionBarLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            }
        });
    }
}