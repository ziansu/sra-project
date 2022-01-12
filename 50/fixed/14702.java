private void CardNameInputLineKeyReleased(java.awt.event.KeyEvent evt) {
    CardList.setListData(dbClient.getCardNamesArrayContaining(CardNameInputLine.getText().toLowerCase()));
}