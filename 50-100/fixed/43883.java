private void addViewsFor(float progress) {
    android.widget.TextView textView = new android.widget.TextView(getContext());
    textView.setText(java.lang.Float.toString(progress));
    textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 12);
    textView.setPadding(0, 24, 0, 24);
    android.widget.LinearLayout.LayoutParams lp = generateDefaultLayoutParams();
    lp.gravity = android.view.Gravity.CENTER_HORIZONTAL;
    addView(textView);
    com.airbnb.lottie.LottieAnimationView animationView = new com.airbnb.lottie.LottieAnimationView(getContext());
    animationView.setProgress(progress);
    addView(animationView);
}