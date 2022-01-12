public java.lang.String getMultipleDiceRolls(int num) {
    java.lang.String rolls = "";
    for (int i = 0; i < num; i++) {
        rolls += getDiceRoll();
    }
    return rolls;
}