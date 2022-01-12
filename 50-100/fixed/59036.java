public void hint() {
    textArea.clear();
    if ((game.getCards().size()) >= 2) {
        java.util.LinkedHashSet<data.Card> rndCards = data.Director.selectRandomCards(5, game.getDeck());
        for (data.Card c : rndCards) {
            textArea.appendText(((c.getRomanji()) + "\n"));
        }
    }
    if ((points) > 0.0) {
        points -= 0.5;
    }
    refreshGUI();
}