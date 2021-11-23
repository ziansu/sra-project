public void setTranslation(double x, double y) {
    this.translatex = x;
    this.translatey = y;
    addResult(perspectives.two_d.ViewerContainer2D.EVENT_ANCHOR_TRANSLATION, x, y);
}