public void repaint() {
    if ((needsUpdate) || ((playButtonValue) != ((geo.isAnimating()) && (app.getKernel().getAnimatonManager().isRunning())))) {
        doUpdate();
    }
}