public void updateCards(main.Player p, boolean turn) {
    deckPane.setVisible(false);
    deckPane.removeAll();
    deckPane.add(back);
    deckPane.setBackground(java.awt.Color.DARK_GRAY);
    for (card.Card c : p.getCards()) {
        javax.swing.JPanel panel = c.drawCard(turn);
        deckPane.add(panel);
    }
    deckPane.setVisible(true);
}