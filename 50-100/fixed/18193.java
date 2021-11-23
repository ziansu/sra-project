public void updateClock() {
    float delta = ((float) ((Clock.getCurrentTime()) - (lastClockUpdate)));
    this.numPassedCycles += ((float) (delta / (msPerCycle)));
    this.lastClockUpdate = Clock.getCurrentTime();
}