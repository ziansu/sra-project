public static android.view.animation.Animation getRotateAroundSelfCenter(long duration) {
    android.view.animation.RotateAnimation anim = new android.view.animation.RotateAnimation(0.0F, 360.0F, android.view.animation.Animation.RELATIVE_TO_SELF, 0.5F, android.view.animation.Animation.RELATIVE_TO_SELF, 0.5F);
    anim.setInterpolator(new android.view.animation.LinearInterpolator());
    anim.setRepeatCount(Animation.INFINITE);
    anim.setDuration(duration);
    return anim;
}