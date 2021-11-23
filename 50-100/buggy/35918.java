public void startTransAnimator(float... position) {
    if (null != (mTransAnimator)) {
        mTransAnimator.cancel();
    }
    mTransAnimator = buildTransAnimator(position);
    mTransAnimator.setInterpolator(new android.view.animation.OvershootInterpolator(8));
    mTransAnimator.setDuration(300);
    mTransAnimator.start();
}