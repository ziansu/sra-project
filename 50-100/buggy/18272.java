public void setAlphaData(int beginAlpha, int endAlpha, long alphaDuration) {
    this.beginAlpha = beginAlpha;
    this.endAlpha = endAlpha;
    this.deltaAlpha = endAlpha - beginAlpha;
    this.alphaDuration = alphaDuration;
    if (((deltaAlpha) != 0) && (beginAlpha != (AlphaValue.MAX))) {
        alpha = beginAlpha;
    }
}