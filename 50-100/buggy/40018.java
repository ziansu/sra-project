private java.lang.String redoAdd() {
    java.lang.String systemMsg;
    javafx.util.Pair<java.lang.String, application.Task> systemMsgWithRemovedTaskPair = Main.list.AddTaskBackToList(_originalTask);
    systemMsg = systemMsgWithRemovedTaskPair.getKey();
    if (systemMsg.equals(Constant.MSG_ADD_SUCCESS)) {
        application.Undo undo = new application.Undo(Command.ADD, _originalTask.getId());
        Main.undos.push(undo);
        systemMsg = Constant.MSG_REDO_ADD_SUCCESS;
    }else {
        systemMsg = Constant.MSG_REDO_ADD_FAIL;
    }
    return systemMsg;
}