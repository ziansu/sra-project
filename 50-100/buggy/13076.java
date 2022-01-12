public void onNumDecksChanged(javafx.beans.value.ObservableValue observable, java.lang.Object oldNum, java.lang.Object newNum) {
    model.CardSettings cardSettings = model.GameCreation.getInstance().getCardSettings();
    if (((java.lang.String) (newNum)).matches("[0-9]*")) {
        cardSettings.setNumDecks(java.lang.Integer.parseInt(((java.lang.String) (newNum))));
        updateSuitTextFields(view.getCardComboBox().getValue());
    }
}