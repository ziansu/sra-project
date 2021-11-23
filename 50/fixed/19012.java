public void switchFullscreen() {
    if (fullscreenMode) {
        deactivateFullscreen();
    }else {
        activateFullscreen(true);
    }
}