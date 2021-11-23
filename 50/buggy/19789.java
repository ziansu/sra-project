private FeedbackMessage executeClear() {
    myTaskList = getCurrentList();
    java.lang.String taskListContent = getTaskListContent(myTaskList);
    return new FeedbackMessage(Logic.MESSAGE_CLEAR, taskListContent);
}