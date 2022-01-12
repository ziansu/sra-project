private void playShowAnimation(android.view.View view) {
    if (null == view) {
        return ;
    }
    if (null != (mShowAnimation)) {
        mShowAnimation.cancel();
    }
    mShowAnimation = new android.view.animation.AlphaAnimation(0.0F, 1.0F);
    mShowAnimation.setDuration(com.testcase.modebreakers.myapplication.AutoLayout.SHOW_HIDE_DURATION);
    mShowAnimation.setFillAfter(true);
    view.startAnimation(mShowAnimation);
}