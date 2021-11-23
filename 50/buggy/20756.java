private android.view.animation.Animation createFadeOutAnimation() {
    android.view.animation.Animation fadeOut = new android.view.animation.AlphaAnimation(1, 0);
    fadeOut.setInterpolator(new android.view.animation.AccelerateInterpolator());
    fadeOut.setDuration(me.anoxic.bulber2.BaseActivity.ANIMATION_DURATION);
    return fadeOut;
}