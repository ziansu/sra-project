public void dealerTurn() {
    card.flipCardUp();
    while ((dealer.getScore()) < (player.getScore()))
        while ((dealer.getScore()) < 17) {
            hit(dealer);
        } 
    
    if ((dealer.getScore()) <= 21) {
        stand(dealer);
    }
}