public void showProgressBar() {
    android.widget.LinearLayout progressBox = ((android.widget.LinearLayout) (findViewById(R.id.progressBox)));
    android.widget.RelativeLayout buttonBox = ((android.widget.RelativeLayout) (findViewById(R.id.buttonBox)));
    progressBox.setVisibility(View.VISIBLE);
    android.view.ViewGroup.LayoutParams layoutParams = progressBox.getLayoutParams();
    layoutParams.height = buttonBox.getHeight();
    progressBox.setLayoutParams(layoutParams);
    setProgressBarProgressTo(me.anoxic.bulber2.BaseActivity.START);
    progressBox.startAnimation(createFadeInAnimation());
}