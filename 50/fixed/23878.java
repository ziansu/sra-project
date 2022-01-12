public void scheduleTask(long tickNumber) {
    ticks += tickNumber;
    if (tickNumber == 0) {
        ticks = 0;
        this.taskPerformed();
    }
}