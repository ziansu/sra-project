public void setElapsedSeconds(int elapsedSeconds) {
    this.elapsedSeconds = elapsedSeconds;
    this.setChanged();
    this.notifyObservers();
}