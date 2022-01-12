public void createPlayerFields() {
    java.lang.String text = newGamePanel.getNumberOfPlayers();
    int numberOfPlayers;
    try {
        numberOfPlayers = java.lang.Integer.parseInt(text);
        if ((numberOfPlayers >= 1) && (numberOfPlayers <= 6)) {
            newGamePanel.setPlayerFields(numberOfPlayers);
            newGamePanel.getOkButton().setEnabled(true);
        }else {
            window.displayErrorMessage("Number of players must be [1-6].");
        }
    } catch (java.lang.NumberFormatException ex) {
        window.displayErrorMessage("You need to enter an integer.");
    }
    window.pack();
}