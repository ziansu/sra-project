private void incrementCardsInPair(dk.ratio.magic.services.deck.chart.Pair<java.lang.Integer, java.lang.Integer> cmcPair) {
    int numberWithThisCMC = (cmcPair.getSecond()) + 1;
    cmcPair.setSecond(numberWithThisCMC);
}