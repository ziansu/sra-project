private void startNextPlayer(fun.personalUse.dataModel.FileBean selectedSong) {
    if ((currentPlayer) == null) {
        playASong(selectedSong);
    }else {
        currentPlayer.stop();
        currentPlayer.dispose();
        playASong(selectedSong);
    }
}