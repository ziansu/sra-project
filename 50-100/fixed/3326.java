public void body() {
    setResult(true);
    synchronized(players) {
        for (chromage.server.PlayerThread p : players) {
            if (p.wantsTermination()) {
                setResult(false);
                setBreak();
            }
        }
    }
    sendUpdates();
}