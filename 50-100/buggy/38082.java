@java.lang.Override
public void run() {
    if (ratingViewId == maxIntOfRating) {
        partialView.setPartialFilled(rating);
    }else
        if (ratingViewId == rating) {
            android.view.animation.Animation rotation = android.view.animation.AnimationUtils.loadAnimation(getContext(), R.anim.rotation);
            partialView.startAnimation(rotation);
        }else {
            partialView.setFilled();
        }
    
}