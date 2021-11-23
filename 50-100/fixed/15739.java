private void sendSelectedCard(java.lang.String card) {
    int dialogResult = javax.swing.JOptionPane.showConfirmDialog(null, "Would you like procced?", "Warning", javax.swing.JOptionPane.YES_OPTION);
    if (dialogResult == (javax.swing.JOptionPane.YES_OPTION)) {
        loadSelectedCard(card, CurrentPanel);
        removeButtonFromPlayerPanel(card);
        sendSelectedCardToServer(card);
    }
}