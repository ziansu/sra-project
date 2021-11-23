private void startNextPlayer(fun.personalUse.dataModel.FileBean selectedSong) {
    if ((currentPlayer) == null) {
        playASong(selectedSong);
    }else {
        currentPlayer.stop();
        playASong(selectedSong);
    }
}