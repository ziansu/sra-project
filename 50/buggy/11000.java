private void quitTinyScreen(android.view.ViewGroup itemContainer) {
    mXibaVideoPlayer.quitTinyScreen(itemContainer);
    mXibaVideoPlayer.setTinyScreenEventCallback(null);
    savePlayerInfo();
}