public boolean forTestNumber(int currentTestNumber) {
    if ((restartFrequency) == 0) {
        return false;
    }
    if (currentTestNumber == 0) {
        return false;
    }
    return (currentTestNumber % (restartFrequency)) == 0;
}