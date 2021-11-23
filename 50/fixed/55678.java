public boolean hasPassedCycle() {
    if ((numPassedCycles) > 0) {
        this.numPassedCycles = 0;
        return true;
    }else {
        return false;
    }
}