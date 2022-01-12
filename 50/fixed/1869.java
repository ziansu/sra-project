public void nextSongButtonListener() {
    if ((currentPlayer) != null) {
        currentPlayer.stop();
        javafx.application.Platform.runLater(new fun.personalUse.mainAlbumTunesApp.AlbumTunesController.EndOfMediaEventHandler());
    }
}