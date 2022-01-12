@java.lang.Override
public void onResumeFragment() {
    if (animate) {
        android.view.animation.AlphaAnimation fadeIn = new android.view.animation.AlphaAnimation(0.0F, 1.0F);
        text.startAnimation(fadeIn);
        fadeIn.setDuration(1000);
        fadeIn.setFillAfter(true);
        pieChart.animateXY(1500, 1500);
        animate = false;
    }
    text.setVisibility(View.VISIBLE);
    pieChart.setVisibility(View.VISIBLE);
}