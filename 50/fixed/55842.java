public void dismissProgress() {
    if ((mRotateAnim) != null) {
        mRotateAnim.cancel();
    }
    mRotateView.setVisibility(com.morening.october_userlogin.view.custom.GONE);
}