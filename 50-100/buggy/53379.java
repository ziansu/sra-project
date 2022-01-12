@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    if (getCancelEndIsAble()) {
        progressAnimSet.resume();
        halo.setAlpha(0);
        haloAnim.setStartDelay(com.example.demoCollection.animation.ProgressView.HALO_ANIM_DELAY);
        haloAnim.setDuration(((long) (((com.example.demoCollection.animation.ProgressView.HALO_ANIM_DURATION) * (getProgress())) / 100.0F)));
        haloAnim.start();
    }
}