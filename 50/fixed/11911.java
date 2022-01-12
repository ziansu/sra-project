public void stopGame() {
    for (core.GameEventListener listener : listeners) {
        listener.gameOver();
    }
    if ((currentThread) != null)
        currentThread.interrupt();
    
}