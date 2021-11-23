public void actionPerformed(java.awt.event.ActionEvent evt) {
    joker1.showFront();
    if ((openCards.size()) > 2)
        closeCards();
    
    openCards.add(joker1);
    joker1.setEnabled(false);
    cardOpen();
}