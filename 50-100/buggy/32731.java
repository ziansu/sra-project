@java.lang.Override
public void onClick(android.view.View v) {
    if (!(isAnimationRunning)) {
        if ((contentLayout.getVisibility()) == (VISIBLE))
            collapse(contentLayout);
        else
            expand(contentLayout);
        
        isAnimationRunning = true;
        new android.os.Handler().postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                isAnimationRunning = false;
            }
        }, duration);
    }
    onHeaderClickListener.onClick(v);
}