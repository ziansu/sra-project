public void trickOver() {
    for (models.Card card : model.getCardsInPlay().getAllCards()) {
    }
    javax.swing.JOptionPane.showMessageDialog(view.getFrame(), "Trick over");
    clearTable();
    if (model.isHandOver()) {
        handOver();
    }
}