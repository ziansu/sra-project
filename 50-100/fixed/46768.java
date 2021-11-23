public static boolean checkForWin(java.lang.String color) {
    boolean won = true;
    java.util.ArrayList<com.gruppe4.menschaergerdichnicht.Logic.Pin> myPins = com.gruppe4.menschaergerdichnicht.Logic.PlaygroundModel.getPinsForColor(color);
    for (int i = 0; (i < (myPins.size())) && won; i++) {
        if ((myPins.get(i).getCurrentType().compareTo(FieldType.GoalField)) != 0) {
            won = false;
        }
    }
    return won;
}