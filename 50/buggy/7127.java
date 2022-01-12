public void finish(com.art.alligator.TransitionAnimation animation) {
    if (animation.needDelayActivityFinish(mActivity)) {
        mActivity.supportFinishAfterTransition();
    }else {
        mActivity.finish();
    }
    animation.applyToActivityAfterFinish(mActivity);
}