private void runTurnHuman() {
    confirm = false;
    java.lang.System.out.println(currentPlayer.getName());
    if (((!(currentPlayer.getPass())) && (!(roundEnd))) && (!(currentPlayer.getWon()))) {
        java.lang.System.out.println("reached2");
        confirm = checkMagnetite();
        if (!(confirm)) {
            java.lang.System.out.println("reached3");
            processCard();
        }
    }
}