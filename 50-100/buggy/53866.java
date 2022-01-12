private java.lang.String updateTask(int ID) {
    tasks.get(ID).updateDetails(commandDetails);
    determineTaskType(tasks.get(ID));
    Task updatedTask = tasks.get(ID);
    CommandDetails updatedDetails = new CommandDetails(CommandDetails.COMMANDS.UPDATE, updatedTask.getDescription(), updatedTask.getStartDate(), updatedTask.getDeadline(), ID);
    history.insert(updatedDetails);
    storage.save(tasks);
    return displayAllTasks();
}