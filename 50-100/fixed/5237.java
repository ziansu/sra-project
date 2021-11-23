private int calculatePoints(int scoringMethod) {
    int[] set = new int[getAllSelectedDiceValues().size()];
    for (int i = 0; i < (set.length); i++) {
        set[i] = getAllSelectedDiceValues().get(i).intValue();
    }
    com.jesperblidkvist.android.thirty.model.SetHelper scoring = new com.jesperblidkvist.android.thirty.model.SetHelper();
    return scoring.getCombinations(set, scoringMethod);
}