@org.junit.Before
public void setUp() {
    model = new seedu.address.model.ModelManager(seedu.address.testutil.TypicalPersons.getTypicalAddressBook(), new seedu.address.model.UserPrefs());
    expectedModel = new seedu.address.model.ModelManager(model.getAddressBook(), new seedu.address.model.UserPrefs());
    sortCommand = new seedu.address.logic.commands.SortCommand();
    sortCommand.setData(model, new seedu.address.logic.CommandHistory(), new seedu.address.logic.UndoRedoStack());
}