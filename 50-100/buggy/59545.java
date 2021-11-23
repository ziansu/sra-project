public void validate(final boolean async) {
    createRulesSafelyAndLazily();
    android.view.View lastView = getLastView();
    if (com.mobsandgeeks.saripaar.Validator.Mode.BURST.equals(mValidationMode)) {
        validateUnorderedFieldsWithCallbackTill(lastView, async);
    }else
        if (com.mobsandgeeks.saripaar.Validator.Mode.IMMEDIATE.equals(mValidationMode)) {
            java.lang.String reasonSuffix = java.lang.String.format("in %s mode.", com.mobsandgeeks.saripaar.Validator.Mode.IMMEDIATE.toString());
            validateOrderedFieldsWithCallbackTill(lastView, reasonSuffix, async);
        }else {
            throw new java.lang.RuntimeException("This should never happen!");
        }
    
}