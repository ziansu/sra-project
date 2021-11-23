@java.lang.Override
public void start() {
    super.start();
    com.github.ybq.android.spinkit.animation.AnimationUtils.start(sprites);
    com.github.ybq.android.spinkit.animation.AnimationUtils.start(getAnimation());
}