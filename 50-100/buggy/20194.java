private boolean totalCardCountValidation() {
    model.CardSettings cardSettings = model.GameCreation.getInstance().getCardSettings();
    int numDecks = java.lang.Integer.parseInt(view.getNumDecksTextField().getText());
    int expectedNumCards = numDecks * 52;
    int actualNumCards = cardSettings.getTotalCount();
    if (actualNumCards > expectedNumCards) {
        showTotalCardCountErrorAlert();
        return false;
    }
    return true;
}