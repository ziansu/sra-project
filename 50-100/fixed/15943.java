private void songTimeBarStateChanged(javax.swing.event.ChangeEvent evt) {
    if ((!(mpModel.isEmpty())) && ((java.lang.Math.abs(((songTimeBar.getValue()) - ((mpModel.getCurrentSong().getElapsedTime()) * 1000)))) >= (GUI.MusicPlayerView.speedConstant))) {
        mpModel.seek(songTimeBar.getValue());
    }
}