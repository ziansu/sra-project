public void fullScreen(java.lang.String renderer) {
    if (insideSettings("fullScreen", renderer)) {
        fullScreen = true;
        this.renderer = renderer;
    }
}