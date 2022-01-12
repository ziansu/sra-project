public int stopTimer() {
    t.cancel();
    solvedTime = ((minutes) * 60) + (seconds);
    com.laquysoft.motivetto.MediaPlayerService.setTrackProgressTo(getActivity(), 0);
    com.laquysoft.motivetto.MediaPlayerService.playTrackWin(getActivity(), 0);
    return solvedTime;
}