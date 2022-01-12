private void handlePreviousBtnClick() {
    releaseResources();
    --(currentPosition);
    if ((currentPosition) < 0) {
        currentPosition = 0;
    }else {
        setCurrentSongUi();
        resetUiElements();
        if (raiseToastIfNetworkNotAvailable()) {
            return ;
        }
        if ((playService) != null) {
            playService.setSeekPosition(0);
            playService.playSong(currentPosition);
        }
    }
}