private void sendSelectedCard(java.lang.String card) {
    int dialogButton = javax.swing.JOptionPane.YES_OPTION;
    int dialogResult = javax.swing.JOptionPane.showConfirmDialog(null, "Would you like procced?", "Warning", dialogButton);
    if (dialogResult == (javax.swing.JOptionPane.YES_OPTION)) {
        loadSelectedCard(card, CurrentPanel);
        removeButtonFromPlayerPanel(card);
        sendSelectedCardToServer(card);
    }
}