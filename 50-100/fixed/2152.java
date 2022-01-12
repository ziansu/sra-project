@butterknife.OnClick(value = R.id.close_info_full_c_card)
public void closeInfo() {
    cv.setVisibility(View.INVISIBLE);
    hideAnim.cancel();
    cv.startAnimation(hideAnim);
    showInfo.setVisibility(View.VISIBLE);
    btnFadeInAnim.cancel();
    showInfo.startAnimation(btnFadeInAnim);
    if ((activity) instanceof com.engstuff.coloriphornia.interfaces.HideInfoListener) {
        ((com.engstuff.coloriphornia.interfaces.HideInfoListener) (activity)).onHideInfoInvoked(true);
    }
}