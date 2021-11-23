private void calculateMaxStats() {
    for (int i = 0; i <= 7; i++) {
        maxstats[i] = (myCharacter.getMaxMods(i)) + (myJob.getMaxStats(i));
    }
}