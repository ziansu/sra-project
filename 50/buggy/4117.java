public static java.lang.String getMultipleDiceRolls(int num) {
    java.lang.String rolls = "";
    for (int i = 0; i < num; i++) {
        rolls += com.paradice.suprabhat.paradice.Roller.getDiceRoll();
    }
    return rolls;
}