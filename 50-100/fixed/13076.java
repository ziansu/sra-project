public void onNumDecksChanged(javafx.beans.value.ObservableValue observable, java.lang.Object oldNum, java.lang.Object newNum) {
    if (((java.lang.String) (newNum)).matches("[0-9]*")) {
        cardSettings.setNumDecks(java.lang.Integer.parseInt(((java.lang.String) (newNum))));
        updateSuitTextFields(view.getCardComboBox().getValue());
    }
}