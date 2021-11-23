public boolean hasPassedCycle() {
    if ((numPassedCycles) > 0) {
        (this.numPassedCycles)--;
        return true;
    }else {
        return false;
    }
}