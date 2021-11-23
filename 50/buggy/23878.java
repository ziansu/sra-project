public void scheduleTask(long tickNumber) {
    ticks += tickNumber;
    if (((ticks) == 0) && (tickNumber == 0))
        this.taskPerformed();
    
}