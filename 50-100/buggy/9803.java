public com.bftcom.timesheet.export.WorklogExportParams projects(java.util.Collection<java.lang.String> projectNames) {
    if (projectNames == null) {
        this.projects = java.util.Collections.emptyList();
    }else {
        this.projects = transformProjects(((java.lang.String[]) (projectNames.toArray())));
    }
    return this;
}