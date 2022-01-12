public void validateBefore(final android.view.View view, final boolean async) {
    createRulesSafelyAndLazily(false);
    android.view.View previousView = getViewBefore(view);
    validateOrderedFieldsWithCallbackTill(previousView, "when using 'validateBefore(View)'.", async);
}