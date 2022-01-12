private FeedbackMessage executeDelete(int userInputIndex) throws java.io.IOException {
    int taskID = getTaskIDFromUserInput(userInputIndex);
    myTaskList = getCurrentList();
    Tasks deletedTask = getTaskFromTaskID(myTaskList, taskID);
    storage.deleteTask(taskID);
    myTaskList = getCurrentList();
    java.lang.String taskListContent = getTaskListContent(myTaskList);
    Command reversedCommand = new Command("add", deletedTask);
    commandHistoryList.addCommand(reversedCommand);
    commandTypeList.addCommandType("delete");
    return new FeedbackMessage(Logic.MESSAGE_DELETED, taskListContent);
}