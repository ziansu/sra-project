public int findStartPlayer() {
    this.startPlayer = ((potsFinished) % 4) - 1;
    return this.startPlayer;
}