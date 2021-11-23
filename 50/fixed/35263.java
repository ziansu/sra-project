private void incrementCardsInPair(dk.ratio.magic.services.deck.chart.Pair<java.lang.Integer, java.lang.Integer> cmcPair, int count) {
    int numberWithThisCMC = (cmcPair.getSecond()) + count;
    cmcPair.setSecond(numberWithThisCMC);
}