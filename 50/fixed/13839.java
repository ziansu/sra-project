private void calculateGrowths() {
    for (int i = 0; i <= (growths.length); i++) {
        growths[i] = (myCharacter.getGrowths(i)) + (myJob.getGrowths(i));
    }
}