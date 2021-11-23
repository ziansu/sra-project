@java.lang.Override
public void onAnimationStart() {
    if ((mTargetVisibility) == (android.view.View.VISIBLE)) {
        mCallback.setViewVisibilityState(mViewId, mTargetVisibility);
    }
}