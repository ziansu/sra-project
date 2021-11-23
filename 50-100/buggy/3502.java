public void onMaxPlayersChanged(javafx.beans.value.ObservableValue observable, java.lang.Object oldMaxNumPlayers, java.lang.Object newMaxNumPlayers) {
    if (((java.lang.String) (newMaxNumPlayers)).matches("[0-9]*")) {
        model.GameCreation.getInstance().resetPlayers(java.lang.Integer.parseInt(((java.lang.String) (newMaxNumPlayers))));
        updatePlayersComboBox();
    }
}