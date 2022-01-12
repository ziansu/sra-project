public void showProgressBar() {
    android.widget.LinearLayout progressBox = ((android.widget.LinearLayout) (findViewById(R.id.progressBox)));
    android.widget.RelativeLayout buttonBox = ((android.widget.RelativeLayout) (findViewById(R.id.buttonBox)));
    android.view.ViewGroup.LayoutParams layoutParams = progressBox.getLayoutParams();
    layoutParams.height = buttonBox.getHeight();
    progressBox.setLayoutParams(layoutParams);
    progressBar.setVisibility(View.VISIBLE);
    setProgressBarProgressTo(me.anoxic.bulber2.BaseActivity.START);
    progressBox.startAnimation(createFadeInAnimation());
}