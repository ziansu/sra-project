@org.junit.Before
public void setUp() {
    model = new teamthree.twodo.model.ModelManager(new teamthree.twodo.testutil.TypicalTask().getTypicalTaskBook(), new teamthree.twodo.model.UserPrefs());
    history = new teamthree.twodo.logic.CommandHistory();
    undoHistory = new teamthree.twodo.logic.UndoCommandHistory();
    undoCommand = new teamthree.twodo.logic.commands.UndoCommand();
    undoCommand.setData(model, history, undoHistory, null);
    this.taskList = teamthree.twodo.testutil.TestUtil.generateSampleTaskData();
}