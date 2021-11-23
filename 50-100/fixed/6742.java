@java.lang.Override
protected void resetGame() {
    super.resetGame();
    m_deck.shuffle();
    m_board.setInitiation(true);
    for (int i = 0; i < (m_board.getMaxCardsX()); i++) {
        for (int j = 0; j < (i + 1); j++) {
            m_board.addCard(m_deck.dealCard(), i);
        }
    }
    m_board.setInitiation(false);
    stats.startTimer();
}