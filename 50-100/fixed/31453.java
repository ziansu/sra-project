void turnAI() {
    int number = findMaxWeight();
    java.lang.System.out.println("Ход AI");
    buttons.get(number).setIcon(iconO);
    weightField[(number % 3)][(number / 3)] = O;
    if (isWin(O))
        trueWinner(O);
    
    weightUpLift(number);
}