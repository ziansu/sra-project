public int compare(com.boardgame.friday.cards.Card card1, com.boardgame.friday.cards.Card card2) {
    java.lang.Integer card1Strength = ((com.boardgame.friday.cards.RobinsonCard) (card1)).getAttackStrength();
    java.lang.Integer card2Strength = ((com.boardgame.friday.cards.RobinsonCard) (card2)).getAttackStrength();
    return card1Strength.compareTo(card2Strength);
}