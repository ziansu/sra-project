public void actionPerformed(java.awt.event.ActionEvent event) {
    for (int i = 0; i < 4; i++) {
        cardToShow2.setVisible(false);
        cardToShow.setVisible(false);
        ButtonsArray[i].setVisible(true);
        ButtonsArray[i].setEnabled(false);
    }
    userTurn(data);
}