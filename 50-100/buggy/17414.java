public void show() {
    if (!(isAnimationRunning)) {
        if ((onStartShowingListener) != null)
            onStartShowingListener.onStartShowing(this);
        
        expand(contentLayout);
        isAnimationRunning = true;
        new android.os.Handler().postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                isAnimationRunning = false;
                if ((onFinishShowingListener) != null)
                    onFinishShowingListener.onFinishShowing(com.andexert.expandablelayout.library.ExpandableLayout.this);
                
            }
        }, duration);
    }
}