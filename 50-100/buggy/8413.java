public com.softserverinc.edu.entities.WorkLog getNewWorkLog(java.lang.Long issueId) {
    if (getCurrentIssue(issueId).getAssignee().equals(workLogSecurityService.getActiveUser())) {
        com.softserverinc.edu.entities.WorkLog workLog = new com.softserverinc.edu.entities.WorkLog();
        workLog.setIssue(getCurrentIssue(issueId));
        workLog.setUser(workLogSecurityService.getActiveUser());
        return workLog;
    }
    return null;
}