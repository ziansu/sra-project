public void setElapsedSeconds(int elapsedSeconds) {
    this.setChanged();
    this.notifyObservers();
}