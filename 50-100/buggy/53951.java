private void dealCards() {
    print("Dealing cards...");
    for (int i = 0; i < 2; i++) {
        for (cardgames.blackjack.Player p : players) {
            if ((p.getCurrentWager()) == 0) {
                p.setStatus(Status.STAND);
            }else {
                p.getHand().addCard(dealCard());
            }
        }
    }
}