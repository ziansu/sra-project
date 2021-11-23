@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    canvasAngle = ((float) (animation.getAnimatedValue()));
    android.util.Log.e(com.xingstarx.canvas.view.CustomView.TAG, ("onAnimationUpdate canvasAngle == " + (canvasAngle)));
}