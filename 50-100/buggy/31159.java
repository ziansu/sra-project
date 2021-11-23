public void aiTurn(Card card, java.lang.String newComment) {
    makePanel1("", card);
    makePanel2(newComment);
    java.lang.String filename = cardImageFileName(card);
    img.setIcon(new javax.swing.ImageIcon(filename));
    statementB.setText(newComment);
    statementC.setText("");
    input.setEditable(false);
}