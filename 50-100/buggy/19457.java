private com.opensymphony.workflow.InvalidInputException getException(java.util.Map transientVars, java.lang.String field, java.lang.String key) {
    com.opensymphony.workflow.InvalidInputException invalidInputException = new com.opensymphony.workflow.InvalidInputException();
    com.atlassian.jira.util.I18nHelper i18n = this.beanFactory.getInstance(com.atlassian.jira.component.ComponentAccessor.getJiraAuthenticationContext().getUser().getDirectoryUser());
    if (isFieldOnScreen(transientVars, field)) {
        invalidInputException.addError(field, i18n.getText(key));
    }else {
        invalidInputException.addError(i18n.getText(key));
    }
    return invalidInputException;
}