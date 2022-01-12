@butterknife.OnClick(value = R.id.show_info_full_c)
public void showInfo() {
    cv.setVisibility(View.VISIBLE);
    showAnim.cancel();
    cv.startAnimation(showAnim);
    showInfo.setVisibility(View.INVISIBLE);
    btnFadeOutAnim.cancel();
    showInfo.startAnimation(btnFadeOutAnim);
    if ((activity) instanceof com.engstuff.coloriphornia.interfaces.HideInfoListener) {
        ((com.engstuff.coloriphornia.interfaces.HideInfoListener) (activity)).onHideInfoInvoked(false);
    }
}