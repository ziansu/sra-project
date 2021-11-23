private java.lang.Long getTotalSpentTimeForIssueByAllUsers(java.lang.Long issueId) {
    java.lang.Long totalSpentTime = new java.lang.Long(0);
    java.util.List<com.softserverinc.edu.entities.WorkLog> workLogList = findByIssue(getCurrentIssue(issueId));
    for (com.softserverinc.edu.entities.WorkLog worklogIterator : workLogList) {
        totalSpentTime += worklogIterator.getAmountOfTime();
    }
    return totalSpentTime;
}