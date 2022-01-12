private FeedbackMessage executeAdd(Tasks newTask) {
    storage.appendTask(newTask);
    myTaskList = getCurrentList();
    java.lang.String taskListContent = getTaskListContent(myTaskList);
    int taskListSize = myTaskList.size();
    int newTaskID = myTaskList.get((taskListSize - 1)).getTaskID();
    Command reversedCommand = new Command("delete", newTaskID);
    commandHistoryList.addCommand(reversedCommand);
    commandTypeList.addCommandType("add");
    return new FeedbackMessage(Logic.MESSAGE_ADDED, myTaskList);
}