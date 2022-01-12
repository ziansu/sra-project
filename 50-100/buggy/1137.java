private FeedbackMessage executeSearch(java.lang.String keyword) throws java.io.IOException {
    myTaskList = getCurrentList();
    java.util.ArrayList<Tasks> searchList = storage.SearchTask(keyword);
    if ((searchList.size()) != 0) {
        java.lang.String taskListContent = getTaskListContent(searchList);
        return new FeedbackMessage(java.lang.String.format(Logic.MESSAGE_SEARCH, "successfully"), taskListContent);
    }else {
        java.lang.String taskListContent = getTaskListContent(myTaskList);
        return new FeedbackMessage(java.lang.String.format(Logic.MESSAGE_SEARCH, "failed"), taskListContent);
    }
}