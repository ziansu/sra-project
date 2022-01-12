public itinerary.main.State addTask(itinerary.main.Command command) {
    listTask.add(((command.getTask().getLineNumber()) - 1), command.getTask());
    updateLineNum();
    itinerary.main.JsonIOHandler.writeJSONList(currFile, listTask);
    return new itinerary.main.State(command, new itinerary.main.Command(command.getTask(), CommandType.DELETE, null), getAllTasks(), true);
}