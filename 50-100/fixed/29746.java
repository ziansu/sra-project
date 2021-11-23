private java.lang.String addTask(cs2103_w09_1j.esther.Command command) {
    java.lang.String taskName = command.getSpecificParameter("taskName");
    try {
        cs2103_w09_1j.esther.Task task = new cs2103_w09_1j.esther.Task(command);
        _tasks.add(task);
        _storage.writeToFile(_tasks);
        _undoStack.push(storePreviousState(command, task));
        _status = Logic.Status.STATUS_SUCCESS_ADD;
    } catch (java.text.ParseException pe) {
        _status = Logic.Status.STATUS_ERROR_ADD;
    }
    return getStatusMessage(taskName, null);
}