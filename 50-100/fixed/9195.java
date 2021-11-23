public itinerary.main.State deleteTask(itinerary.main.Command command) {
    boolean isValid = isValidDeleteOp(command);
    itinerary.main.Task originalTask = null;
    if (isValid) {
        originalTask = listTask.remove(((command.getTask().getLineNumber()) - 1));
        updateLineNum();
        itinerary.main.JsonIOHandler.writeJSONList(currFile, listTask);
    }
    return new itinerary.main.State(command, new itinerary.main.Command(originalTask, CommandType.ADD, null), getAllTasks(), isValid);
}