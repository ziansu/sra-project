private void validateFieldsWithCallbackTill(final android.view.View view, final boolean orderedFields, final java.lang.String reasonSuffix, final boolean async) {
    createRulesSafelyAndLazily(false);
    if (async) {
        if ((mAsyncValidationTask) != null) {
            mAsyncValidationTask.cancel(true);
        }
        mAsyncValidationTask = new com.mobsandgeeks.saripaar.Validator.AsyncValidationTask(view, orderedFields, reasonSuffix);
        mAsyncValidationTask.execute(((java.lang.Void[]) (null)));
    }else {
        handleCallbacks(validateTill(view, orderedFields, reasonSuffix));
    }
}