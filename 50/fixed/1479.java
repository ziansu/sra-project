public void death() {
    stop();
    setState(MovableState.DEATH);
    this.health = 0;
}