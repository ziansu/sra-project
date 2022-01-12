private void handleResponse(final com.xceptance.xlt.common.util.action.data.URLActionData action, final com.xceptance.xlt.common.util.action.validation.URLActionDataExecutableResult result) {
    validateResponseCode(action, result);
    handleValidations(action, result);
    handleStore(action, result);
}