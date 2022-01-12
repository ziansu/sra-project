public void setPlayOnce(java.lang.String animation) {
    if ((playOnce) != null) {
    }
    playOnce = cacheAndSetPlayer(animation);
    playOnce.removeListener(cachedPlayerFinishedListener);
    playOnce.addListener(cachedPlayerFinishedListener);
    if ((controllerListener) != null) {
        playOnce.removeListener(controllerListener);
        playOnce.addListener(controllerListener);
    }
}