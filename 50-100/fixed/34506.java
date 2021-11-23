private void calculateMaxStats() {
    for (int i = 0; i <= (maxstats.length); i++) {
        maxstats[i] = (myCharacter.getMaxMods(i)) + (myJob.getMaxStats((i + 1)));
    }
}