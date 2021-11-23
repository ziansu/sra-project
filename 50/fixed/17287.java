protected double getComboValue(int playerIndex) {
    switch (playerIndex) {
        case 1 :
            return comboPlayer1;
        case 2 :
            return comboPlayer2;
        default :
            java.lang.System.err.println("Fehler! \nUnzul\ufffdssiger playerIndex. \n1 oder 2 erlaubt.");
            return 0.0;
    }
}