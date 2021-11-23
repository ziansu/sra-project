@java.lang.Override
public void changeState(com.example.alexander_topilskii.internetradio.models.database.Station station) {
    currentState = State.IS_WAIT;
    if (station != null) {
        listener.setPlayerStates((-1), State.IS_WAIT);
        if ((mediaPlayer) == null)
            initPlayer(station.getSource());
        else {
            if (mediaPlayer.isPlaying()) {
                pause();
            }else {
                play();
            }
        }
    }
}