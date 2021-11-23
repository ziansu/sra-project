private void setQSHeaderAlpha() {
    if ((mHeaderView) != null) {
        mHeaderView.getBackground().setAlpha(mQSHeaderAlpha);
    }
    if ((mBackgroundImage) != null) {
        mBackgroundImage.setAlpha(mQSHeaderAlpha);
    }
}