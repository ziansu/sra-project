@java.lang.Override
public synchronized void stop() {
    if ((state) == (State.STOPPED))
        return ;
    
    if ((currentPlayer) != null)
        currentPlayer.stop();
    
    currentPlayer = null;
    currentTrackNum = 0;
    currentPos = 0;
    state = State.STOPPED;
    notifyListeners(( listener) -> listener.onPlayerStop());
    currentPos = 0;
}