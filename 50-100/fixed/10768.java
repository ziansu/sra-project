public int getTotalPoints() {
    int points = 0;
    for (int i = 0; i < (this.cards.size()); i++) {
        points += this.cards.get(i).getPoints();
    }
    return points;
}