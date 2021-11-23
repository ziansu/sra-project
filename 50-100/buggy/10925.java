public void parseCommandObject(common.CommandObject commandObj, boolean isUndoAction, boolean isRedoAction) {
    if (!(isUndoAction || isRedoAction)) {
        commandObj.setLastSearchedIndex(lastSearchedIndex);
    }
    logic.CommandFacade commandFacade = new logic.CommandFacade(taskList, undoList, redoList, lastOutputTaskList, commandObj, isUndoAction, isRedoAction);
    commandFacade.run();
    updateLists(commandFacade);
    java.lang.System.out.println(("Last searched index = " + (lastSearchedIndex)));
}