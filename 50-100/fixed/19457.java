private com.opensymphony.workflow.InvalidInputException getException(java.util.Map transientVars, java.lang.String field, java.lang.String key) {
    com.opensymphony.workflow.InvalidInputException invalidInputException = new com.opensymphony.workflow.InvalidInputException();
    if (isFieldOnScreen(transientVars, field)) {
        invalidInputException.addError(field, i18n.getText(key));
    }else {
        invalidInputException.addError(i18n.getText(key));
    }
    return invalidInputException;
}