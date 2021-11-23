private void handlePreviousBtnClick() {
    --(currentPosition);
    if ((currentPosition) < 0) {
        currentPosition = 0;
    }else {
        if (raiseToastIfNetworkNotAvailable()) {
            return ;
        }
        if ((playService) != null) {
            playService.setSeekPosition(0);
            playService.playSong(currentPosition);
        }
    }
}