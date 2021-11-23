private void doAnimation(float startAt, float endAt) {
    android.view.animation.TranslateAnimation animate = new android.view.animation.TranslateAnimation(startAt, endAt, 0, 0);
    animate.setDuration(100);
    animate.setFillAfter(true);
    holder.item.startAnimation(animate);
}