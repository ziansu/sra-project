public void whosFirst() {
    for (Player player : players) {
        pickOneLetter(player);
        players.add(player);
    }
    sortLetter();
}