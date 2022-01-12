private java.lang.String extractTag(java.lang.String userTask) {
    if ((userTask.contains("<")) && (userTask.contains(">"))) {
        int firstIndex = userTask.indexOf("<");
        int lastIndex = userTask.indexOf(">");
        if (firstIndex < lastIndex) {
            setTaskTag(userTask.substring(firstIndex, lastIndex));
            userTask = userTask.replace(userTask.substring(firstIndex, (lastIndex + 1)), "");
        }
    }
    return userTask;
}