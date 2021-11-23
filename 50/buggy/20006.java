public void setStartColor(int color) {
    stopAnimation();
    this.startColor = color;
    reinitialize();
}