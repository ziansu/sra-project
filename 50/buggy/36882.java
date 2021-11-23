public void setMinHeight(int minHeight) {
    if ((getHeight()) < minHeight) {
        quickScaleLayout(mode);
    }
    this.minHeight = minHeight;
}