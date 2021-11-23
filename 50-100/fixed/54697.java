void fillInnerParts() {
    personListPanel = seedu.address.ui.PersonListPanel.load(primaryStage, getPersonListPlaceholder(), logic.getFilteredPersonList());
    resultDisplay = seedu.address.ui.ResultDisplay.load(primaryStage, getResultDisplayPlaceholder());
    commandBox = seedu.address.ui.CommandBox.load(primaryStage, getCommandBoxPlaceholder(), resultDisplay, logic);
}