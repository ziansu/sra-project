private void setCurrentUserFromParam() throws java.lang.IllegalArgumentException {
    java.lang.String selectedUser = getHttpRequest().getParameter(org.everit.jira.timetracker.plugin.JiraTimetrackerChartWebAction.PARAM_USERPICKER);
    if (selectedUser != null) {
        currentUser = selectedUser;
    }else {
        throw new java.lang.IllegalArgumentException(org.everit.jira.timetracker.plugin.JiraTimetrackerChartWebAction.INVALID_USER_PICKER);
    }
    if ("".equals(currentUser)) {
        com.atlassian.jira.security.JiraAuthenticationContext authenticationContext = com.atlassian.jira.component.ComponentAccessor.getJiraAuthenticationContext();
        currentUser = authenticationContext.getUser().getKey();
    }
}