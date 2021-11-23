@java.lang.Override
public void run() {
    if (ratingViewId == maxIntOfRating) {
        partialView.setPartialFilled(rating);
    }else {
        partialView.setFilled();
    }
    if (ratingViewId == rating) {
        android.view.animation.Animation scaleUp = android.view.animation.AnimationUtils.loadAnimation(getContext(), R.anim.scale_up);
        android.view.animation.Animation scaleDown = android.view.animation.AnimationUtils.loadAnimation(getContext(), R.anim.scale_down);
        partialView.startAnimation(scaleUp);
        partialView.startAnimation(scaleDown);
    }
}