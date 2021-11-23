@org.junit.Test
public void execute_help_correctArgs() throws java.lang.Exception {
    assertCommandBehavior("help add", HelpCommand.SHOWING_HELP_ADD_MESSAGE);
    assertCommandBehavior("help edit", HelpCommand.SHOWING_HELP_EDIT_MESSAGE);
    assertCommandBehavior("help mark", HelpCommand.SHOWING_HELP_MARK_MESSAGE);
    assertCommandBehavior("help unmark", HelpCommand.SHOWING_HELP_UNMARK_MESSAGE);
    assertCommandBehavior("help list", HelpCommand.SHOWING_HELP_LIST_MESSAGE);
    assertCommandBehavior("help find", HelpCommand.SHOWING_HELP_FIND_MESSAGE);
    assertCommandBehavior("help view", HelpCommand.SHOWING_HELP_VIEW_MESSAGE);
    assertCommandBehavior("help delete", HelpCommand.SHOWING_HELP_DELETE_MESSAGE);
    assertCommandBehavior("help undo", HelpCommand.SHOWING_HELP_UNDO_MESSAGE);
    assertCommandBehavior("help redo", HelpCommand.SHOWING_HELP_REDO_MESSAGE);
    assertCommandBehavior("help taskdue", HelpCommand.SHOWING_HELP_TASKDUE_MESSAGE);
}