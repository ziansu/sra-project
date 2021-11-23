public itinerary.main.State clearAll() {
    java.util.List<itinerary.main.Task> originalState = getAllTasks();
    listTask.clear();
    itinerary.main.JsonIOHandler.writeJSONList(currFile, listTask);
    return new itinerary.main.State(null, new itinerary.main.Command(null, CommandType.UNDO, null), originalState, true);
}