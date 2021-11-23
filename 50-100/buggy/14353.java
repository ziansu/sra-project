private void doJazzinessImpl(android.view.View item, int position, int scrollDirection) {
    android.view.ViewPropertyAnimator animator = item.animate().setDuration(com.twotoasters.jazzylistview.JazzyHelper.DURATION).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
    scrollDirection = (scrollDirection > 0) ? 1 : -1;
    mTransitionEffect.initView(item, position, scrollDirection);
    mTransitionEffect.setupAnimation(item, position, scrollDirection, animator);
    animator.start();
}