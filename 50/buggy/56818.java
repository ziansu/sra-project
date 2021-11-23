public void setPortrait(boolean portrait) {
    this.portrait = portrait;
    showPortraitOrLandscape();
    if ((fullScreenListener) != null) {
        fullScreenListener.onClick(null, this.portrait);
    }
}