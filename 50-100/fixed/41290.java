private int calculatePoints(int scoringMethod) {
    int[] set = new int[getAllSelectedDiceValues().size()];
    for (int i = 0; i < (set.length); i++) {
        set[i] = getAllSelectedDiceValues().get(i).intValue();
    }
    return scoring.getCombinations(set, scoringMethod);
}