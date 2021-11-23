public void updateClock() {
    float delta = ((float) ((this.getCurrentTime()) - (lastClockUpdate)));
    while (!(isPaused)) {
        this.numPassedCycles += ((int) (java.lang.Math.floor((delta / (msPerCycle)))));
    } 
    this.lastClockUpdate = Clock.getCurrentTime();
}