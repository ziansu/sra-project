private void startInputWhenTransitionsComplete() {
    if ((mViewsTransitionComplete) && (mSharedElementTransitionComplete)) {
        final android.view.View decor = getDecor();
        if (decor != null) {
            final android.view.ViewRootImpl viewRoot = decor.getViewRootImpl();
            viewRoot.setPausedForTransition(false);
        }
        onTransitionsComplete();
    }
}