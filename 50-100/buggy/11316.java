public void setAborted(java.lang.String playerId) {
    validatePlayerId(playerId);
    if (!(aborted)) {
        this.abortedBy = playerId;
        this.aborted = true;
        this.setChanged();
        this.notifyObservers();
    }else {
        this.finished = true;
    }
}