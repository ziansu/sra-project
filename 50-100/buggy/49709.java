@java.lang.Override
public void onAnimationStart(final android.view.animation.Animation animation) {
    mButtons.get(0).setBackgroundResource(R.drawable.radius_button);
    mButtons.get(1).setBackgroundResource(R.drawable.radius_button);
    mButtons.get(2).setBackgroundResource(R.drawable.radius_button);
    mButtons.get(3).setBackgroundResource(R.drawable.radius_button);
    mFadeInAnim.start();
}