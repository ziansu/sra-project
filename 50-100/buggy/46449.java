private boolean isOnTime(com.chinesedreamer.jira.core.Issue issue) {
    return (((issue.getDueDate()) != null) && ((issue.getResolutionDate()) != null)) && (((issue.getResolutionDate().getTime()) - (issue.getDueDate().getTime())) < 3600);
}