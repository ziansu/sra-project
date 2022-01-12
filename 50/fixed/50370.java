private void paint() {
    if ((buffImage) == null) {
        createBuffImage();
    }
    drawAllDisplays();
}