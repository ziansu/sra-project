@java.lang.Override
public synchronized void stop() {
    if ((state) == (State.STOPPED))
        return ;
    
    if ((currentPlayer) != null)
        currentPlayer.stop();
    
    state = State.STOPPED;
    currentPlayer = null;
    playlist = null;
    currentTrackNum = 0;
    notifyListeners(( listener) -> listener.onPlayerStop());
    currentPos = 0;
}