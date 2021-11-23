private java.lang.String extractPriority(java.lang.String commandParameters) {
    int indexOfPriority = commandParameters.indexOf("priority");
    java.lang.String priorityDetails = commandParameters.substring(indexOfPriority);
    priorityDetails = priorityDetails.replace("priority ", "");
    java.lang.String[] removePriorityKeyword = priorityDetails.split(" ");
    return removePriorityKeyword[0];
}