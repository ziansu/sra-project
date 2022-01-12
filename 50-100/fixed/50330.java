private void startInputWhenTransitionsComplete() {
    if ((mViewsTransitionComplete) && (mSharedElementTransitionComplete)) {
        final android.view.View decor = getDecor();
        if (decor != null) {
            final android.view.ViewRootImpl viewRoot = decor.getViewRootImpl();
            if (viewRoot != null) {
                viewRoot.setPausedForTransition(false);
            }
        }
        onTransitionsComplete();
    }
}