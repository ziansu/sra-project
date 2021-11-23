public void clear() {
    if ((selectedIndex) != (-1)) {
        currentInputElement.setValue("");
    }
    selectedIndex = -1;
    optionsPanel.getElement().removeAllChildren();
}