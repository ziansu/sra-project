private void animateButtonsAfterSpeak() {
    android.animation.ObjectAnimator.ofFloat(fab, "rotation", 0.0F, 360.0F).setDuration(600).start();
    if (rotated) {
        fab.setImageDrawable(android.support.graphics.drawable.VectorDrawableCompat.create(getResources(), R.drawable.ic_play_arrow_24dp, null));
    }else {
        fab.setImageDrawable(android.support.graphics.drawable.VectorDrawableCompat.create(getResources(), R.drawable.ic_stop_24dp, null));
    }
}