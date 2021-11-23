private void setAnimation(android.view.View view, int position) {
    if (selectedDays.get(position, false)) {
        android.view.animation.Animation animation = android.view.animation.AnimationUtils.loadAnimation(mContext, android.R.anim.slide_in_left);
        view.startAnimation(animation);
        selectedDays.put(position, true);
    }
}