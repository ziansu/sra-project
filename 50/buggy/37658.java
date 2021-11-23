private javax.swing.JPanel handPanel() {
    javax.swing.JPanel hand = new javax.swing.JPanel();
    javax.swing.JTextArea cards = new javax.swing.JTextArea("the hand goes here");
    cards.setEditable(false);
    hand.add(cards);
    return hand;
}