public void dealHand(card_game.Player player, int handSize) {
    int count = 0;
    while (count < handSize) {
        int index = java.util.concurrent.ThreadLocalRandom.current().nextInt(0, countActiveDeck());
        card_game.Playable card = this.activeDeck.get(index);
        this.activeDeck.remove(card);
        player.addCard(card);
        count++;
    } 
}