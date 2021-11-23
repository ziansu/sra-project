public void repaint() {
    needsUpdate = true;
    if ((needsUpdate) || ((playButtonValue) != ((geo.isAnimating()) && (app.getKernel().getAnimatonManager().isRunning())))) {
        doUpdate();
    }
}