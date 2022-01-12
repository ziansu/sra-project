private java.lang.String printBattleMenu() {
    java.lang.String[] options = new java.lang.String[]{ "Attack" , "Heal" , "Flee" };
    java.lang.String action = input.printMenu(options);
    return action;
}