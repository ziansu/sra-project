private FeedbackMessage executeUpdate(Tasks task) throws java.io.IOException {
    int taskID = task.getTaskID();
    Tasks taskBeforeUpdated = storage.UpdateTask(taskID, task);
    myTaskList = getCurrentList();
    java.lang.String taskListContent = getTaskListContent(myTaskList);
    Command reversedCommand = new Command("delete", taskID);
    commandHistoryList.addCommand(reversedCommand);
    reversedCommand = new Command("add", taskBeforeUpdated);
    commandHistoryList.addCommand(reversedCommand);
    commandTypeList.addCommandType("update");
    return new FeedbackMessage(Logic.MESSAGE_UPDATED, taskListContent);
}