public void split() {
    if ((player.fetchCard(0).type) == (player.fetchCard(1).type)) {
        playerSplit.pushHand(player.fetchCard(1));
        player.removeHand(1);
        hit(player);
        hit(playerSplit);
        split_hand = true;
    }
}