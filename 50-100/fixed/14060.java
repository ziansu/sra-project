public void dealerTurn() {
    card.flipCardUp();
    while ((dealer.getScore()) < (player.getScore())) {
        hit(dealer);
    } 
    if ((dealer.getScore()) <= 21) {
        stand(dealer);
    }
}