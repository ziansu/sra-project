@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    mControlsView.setBackgroundColor(getResources().getColor(R.color.transparent_overlay));
    main_button.setVisibility(View.GONE);
    imageProgressBar.setVisibility(View.VISIBLE);
    fullscreenText.setText(getResources().getText(R.string.loading));
}