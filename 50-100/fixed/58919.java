protected java.lang.String getSelectedFavList() {
    for (int i = 0; i < (radioButtonsSelectFavs.length); i++) {
        if (radioButtonsSelectFavs[i].isSelected()) {
            return radioButtonsSelectFavs[i].getText();
        }
    }
    return "Alle";
}