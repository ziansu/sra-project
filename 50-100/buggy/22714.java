private java.lang.String extractTag(java.lang.String userTask) {
    int firstIndex = userTask.indexOf("<");
    int lastIndex = userTask.indexOf(">");
    setTaskTag(userTask.substring(firstIndex, lastIndex));
    userTask = userTask.replace(userTask.substring(firstIndex, (lastIndex + 1)), "");
    return userTask;
}