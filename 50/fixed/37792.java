public boolean setTime(long time, long timeId) {
    if ((emulationTime) <= time) {
        emulationTime = time;
        return true;
    }
    return false;
}