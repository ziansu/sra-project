@java.lang.Override
public void onAnimationFinished(android.graphics.drawable.AnimationDrawable animation, android.widget.ImageView view) {
    if (animation.isRunning()) {
        animation.stop();
    }
    if (view != null) {
        view.setVisibility(View.GONE);
    }
    if ((mListener) != null) {
        if ((animation.equals(mAniEvolutionSuccess)) || (animation.equals(mAniEvolutionFailed))) {
            mListener.complete(ui.EffectManager.CompleteEventMode.EVOLUTION);
        }
    }
}