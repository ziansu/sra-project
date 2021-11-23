public boolean forTestNumber(int currentTestNumber) {
    return ((restartFrequency) == 0) || ((currentTestNumber % (restartFrequency)) == 0);
}