public void showComputerHand(GameModel model) {
    for (int i = 0; i < (NUM_CARDS_PER_HAND); i++) {
        computerLabels[i] = new CardLabel(model.dealCardFromComputerHand());
        pnlComputerHand.add(computerLabels[i]);
    }
    this.pack();
}