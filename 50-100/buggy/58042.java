public void move() {
    checkDoubles();
    int askPlayer = randomPlayer();
    int cardIndex = ((int) ((java.lang.Math.random()) * (hand.size())));
    askForCard(askPlayer, cardIndex);
    checkDoubles();
    restockCards();
}