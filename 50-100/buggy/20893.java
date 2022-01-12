@java.lang.Override
public int process(java.util.List<org.leanpoker.player.Card> cards) {
    org.leanpoker.player.Card firstCard = cards.get(0);
    org.leanpoker.player.Card secondCard = cards.get(1);
    return firstCard.getRank().equals(secondCard.getSuit()) ? 100 : 0;
}