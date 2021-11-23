private void setAnimation(android.view.View viewToAnimate, int position) {
    android.view.animation.Animation animation = android.view.animation.AnimationUtils.loadAnimation(viewToAnimate.getContext(), R.anim.scale_in);
    viewToAnimate.startAnimation(animation);
}