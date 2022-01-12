@butterknife.OnClick(value = R.id.stn_info_close)
public void onClose() {
    hideProgressBar.setAnimationListener(null);
    hideProgressBar.cancel();
    showInfoAnim.setAnimationListener(null);
    showInfoAnim.cancel();
    progressBar.setVisibility(View.INVISIBLE);
    collapseAnimation.start();
}