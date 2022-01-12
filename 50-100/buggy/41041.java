private void startAnimation(com.androidnerdcolony.idlefactory.ui.adapters.FactoryLineAdapter.ViewHolder holder) {
    objectAnimator = android.animation.ObjectAnimator.ofFloat(holder.workerView, "x", 500.0F, 600.0F);
    objectAnimator.setDuration(500);
    objectAnimator.setRepeatMode(ValueAnimator.REVERSE);
    objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
    if (!(objectAnimator.isStarted())) {
        objectAnimator.setCurrentPlayTime(mCurrentPlayTime);
        objectAnimator.start();
    }else {
        mCurrentPlayTime = objectAnimator.getCurrentPlayTime();
    }
}