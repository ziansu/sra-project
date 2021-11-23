@java.lang.Override
public void userCanAddTimesheetEntry(com.atlassian.jira.user.ApplicationUser user, org.catrobat.jira.timesheet.services.impl.Timesheet sheet, java.util.Date beginDate, boolean isGoogleDocsImport) throws com.atlassian.jira.exception.PermissionException {
    if (userOwnsSheet(user, sheet)) {
        if (isGoogleDocsImport) {
            if (dateIsOlderThanAMonth(beginDate)) {
                throw new com.atlassian.jira.exception.PermissionException("You can not add an entry that is older than 30 days.");
            }
        }else {
            if (dateIsOlderThanFiveYears(beginDate)) {
                throw new com.atlassian.jira.exception.PermissionException("You can not add an imported entry that is older than 5 years.");
            }
        }
    }else
        if (!(isTimesheetAdmin(user))) {
            throw new com.atlassian.jira.exception.PermissionException("Access forbidden: Sorry, you are not a timesheet admin!");
        }
    
}