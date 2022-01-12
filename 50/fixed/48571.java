public void conceal(@android.support.annotation.Size(value = 2)
@android.support.annotation.NonNull
final int[] to) {
    if (changeState(de.wackernagel.android.sidekick.widgets.CircularRevealView.STATE_CONCEAL_STARTED)) {
        animationState = de.wackernagel.android.sidekick.widgets.CircularRevealView.ANIMATION_STARTING;
        circleX = to[0];
        circleY = to[1];
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
    }
}