@java.lang.Override
public void onResumeFragment() {
    if (animate) {
        android.view.animation.AlphaAnimation fadeIn = new android.view.animation.AlphaAnimation(0.0F, 1.0F);
        text.setVisibility(View.VISIBLE);
        text.startAnimation(fadeIn);
        fadeIn.setDuration(1000);
        fadeIn.setFillAfter(true);
        pieChart.setVisibility(View.VISIBLE);
        pieChart.animateXY(1500, 1500);
        animate = false;
    }
}