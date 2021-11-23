private void processStatus(com.fasterxml.jackson.databind.JsonNode input) {
    com.fasterxml.jackson.databind.node.ObjectNode statusNode = ((com.fasterxml.jackson.databind.node.ObjectNode) (input.path(org.symphonyoss.integration.webhook.jira.JiraParserConstants.ISSUE_PATH).path(org.symphonyoss.integration.webhook.jira.JiraParserConstants.FIELDS_PATH).path(org.symphonyoss.integration.webhook.jira.JiraParserConstants.STATUS_PATH)));
    java.lang.String issueStatus = statusNode.path(org.symphonyoss.integration.webhook.jira.JiraParserConstants.NAME_PATH).asText(org.apache.commons.lang3.StringUtils.EMPTY);
    if (org.apache.commons.lang3.StringUtils.isNotEmpty(issueStatus)) {
        statusNode.put(org.symphonyoss.integration.webhook.jira.JiraParserConstants.NAME_PATH, issueStatus.toUpperCase());
    }
}