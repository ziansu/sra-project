private java.lang.String printBattleMenu() {
    java.lang.String[] options = new java.lang.String[]{ "Attack" , "Heal" , "Flee" };
    int actionIndex = this.input.printMenu(options);
    java.lang.String action = options[actionIndex];
    return action;
}