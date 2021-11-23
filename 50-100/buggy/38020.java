private static java.lang.String executeDelete(java.lang.String userInput) {
    java.lang.String systemMsg = null;
    javafx.util.Pair<application.Task, java.lang.String> deleteDetailsPair = Main.list.deleteTaskFromList(userInput);
    application.Task removedTask = deleteDetailsPair.getKey();
    java.lang.String removedTaskId = deleteDetailsPair.getValue();
    if (removedTask != null) {
        application.Undo.prepareUndoDelete(removedTask, removedTaskId);
        systemMsg = Constant.MSG_DELETE_SUCCESS.replace(Constant.DELIMITER_REPLACE, removedTask.getId());
    }else {
        systemMsg = Constant.MSG_ITEM_NOT_FOUND;
    }
    return systemMsg;
}