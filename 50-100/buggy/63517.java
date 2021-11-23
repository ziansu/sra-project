public void checkWinner(java.lang.String text) {
    java.lang.String[] command = text.split(" ");
    int playerNumber = -1;
    if (text.startsWith(Game.WINNER)) {
        try {
            playerNumber = java.lang.Integer.parseInt(command[1]);
        } catch (java.lang.NumberFormatException e) {
            java.lang.System.out.println("Not a number. WINNER.");
        }
        java.lang.System.out.println((("The winner is... " + (getPlayerName(playerNumber))) + "!"));
        shutdown();
    }
}