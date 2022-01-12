public java.lang.String getDiceRoll() {
    int num = getRandomNumber();
    java.lang.String roll = "";
    switch (num) {
        case 0 :
            roll = "\u2680";
            break;
        case 1 :
            roll = "\u2681";
            break;
        case 2 :
            roll = "\u2682";
            break;
        case 3 :
            roll = "\u2683";
            break;
        case 4 :
            roll = "\u2684";
            break;
        case 5 :
            roll = "\u2685";
            break;
        default :
            roll = "Tap to roll dice.";
            break;
    }
    return roll;
}