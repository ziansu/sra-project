public void trickOver() {
    for (models.Card card : model.getCardsInPlay().getAllCards()) {
        models.Card c = card;
    }
    javax.swing.JOptionPane.showMessageDialog(view.getFrame(), "Trick over");
    clearTable();
    if (model.isHandOver()) {
        handOver();
    }
}