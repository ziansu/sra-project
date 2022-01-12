private void handleNextBtnClick() {
    ++(currentPosition);
    if ((currentPosition) >= (songInfoArray.length)) {
        currentPosition = (songInfoArray.length) - 1;
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