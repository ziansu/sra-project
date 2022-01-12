@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if (!(canceled)) {
        currentAnimator = null;
        setState(com.flipboard.bottomsheet.BottomSheetLayout.State.HIDDEN);
        setSheetLayerTypeIfEnabled(com.flipboard.bottomsheet.LAYER_TYPE_NONE);
        removeView(sheetView);
        for (com.flipboard.bottomsheet.OnSheetDismissedListener onSheetDismissedListener : onSheetDismissedListeners) {
            onSheetDismissedListener.onDismissed(this);
        }
        viewTransformer = null;
        onSheetDismissedListeners.clear();
        onSheetStateChangeListeners.clear();
        if ((runAfterDismiss) != null) {
            runAfterDismiss.run();
            runAfterDismiss = null;
        }
    }
}