public void startAnimation() {
    this.animated = true;
    if ((this.lastUpdate) == 0) {
        this.lastUpdate = java.lang.System.currentTimeMillis();
    }
}