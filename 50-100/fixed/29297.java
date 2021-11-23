private java.lang.String getAccessToken(java.lang.String jiraIntegrationURL, java.lang.Long userId) {
    try {
        java.lang.String accessToken = jiraWebHookIntegration.getAccessToken(jiraIntegrationURL, userId);
        if ((accessToken == null) || (accessToken.isEmpty())) {
            throw new org.symphonyoss.integration.jira.exception.JiraAuthorizationException(org.symphonyoss.integration.jira.properties.JiraErrorMessageKeys.COMPONENT, org.symphonyoss.integration.jira.api.JiraApiResource.MSG.getMessage(org.symphonyoss.integration.jira.properties.JiraErrorMessageKeys.EMPTY_ACCESS_TOKEN), org.symphonyoss.integration.jira.api.JiraApiResource.MSG.getMessage(org.symphonyoss.integration.jira.properties.JiraErrorMessageKeys.EMPTY_ACCESS_TOKEN_SOLUTION, jiraIntegrationURL));
        }
        return accessToken;
    } catch (org.symphonyoss.integration.authorization.AuthorizationException e) {
        throw new org.symphonyoss.integration.jira.exception.JiraUnexpectedAuthorizationException(org.symphonyoss.integration.jira.properties.JiraErrorMessageKeys.COMPONENT, e.getMessage(), e);
    }
}