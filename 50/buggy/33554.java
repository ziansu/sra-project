private android.animation.Animator createHollowSelectorAnimator() {
    return android.animation.ObjectAnimator.ofObject(null, net.ganin.darv.DpadAwareRecyclerView.BOUNDS_PROP_NAME, new net.ganin.darv.RectEvaluator(), mSelectorSourceRect, mSelectorDestRect);
}