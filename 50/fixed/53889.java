@java.lang.Override
public org.catrobat.jira.timesheet.activeobjects.TimesheetEntry getLatestEntry(org.catrobat.jira.timesheet.activeobjects.Timesheet timesheet) {
    org.catrobat.jira.timesheet.activeobjects.TimesheetEntry[] entries = this.getEntriesBySheet(timesheet);
    if ((entries.length) == 0) {
        return null;
    }
    return entries[0];
}