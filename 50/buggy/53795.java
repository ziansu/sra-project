private FeedbackMessage executeSort() throws java.io.IOException {
    myTaskList = getCurrentList();
    myTaskList.sort(null);
    java.lang.String taskListContent = getTaskListContent(myTaskList);
    return new FeedbackMessage(Logic.MESSAGE_SORTED, taskListContent);
}