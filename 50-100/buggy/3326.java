public void body() {
    setResult(true);
    for (chromage.server.PlayerThread p : ((java.util.ArrayList<chromage.server.PlayerThread>) (players.clone()))) {
        if (p.wantsTermination()) {
            setResult(false);
            setBreak();
        }
    }
    sendUpdates();
}