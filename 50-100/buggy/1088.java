public itinerary.main.State editTask(itinerary.main.Command command) {
    itinerary.main.Task originalTask = listTask.remove(((command.getTask().getLineNumber()) - 1));
    listTask.add(command.getTask());
    itinerary.main.JsonIOHandler.writeJSONList(currFile, listTask);
    return new itinerary.main.State(command, new itinerary.main.Command(originalTask, CommandType.EDIT), getAllTasks(), true);
}