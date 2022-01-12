public void addError(org.jetbrains.mps.openapi.model.SNode errorNode, java.lang.String errorString, @org.jetbrains.annotations.Nullable
org.jetbrains.mps.openapi.model.SNodeReference ruleNode, jetbrains.mps.errors.messageTargets.MessageTarget messageTarget, jetbrains.mps.errors.QuickFixProvider intentionProvider) {
    jetbrains.mps.errors.SimpleErrorReporter reporter = new jetbrains.mps.errors.SimpleErrorReporter(errorNode, errorString, ruleNode, jetbrains.mps.errors.MessageStatus.ERROR, messageTarget);
    if (intentionProvider != null) {
        reporter.setIntentionProvider(intentionProvider);
    }
    jetbrains.mps.checkers.LanguageErrorsComponent.addToMappedSet(myNodesToErrors, errorNode, reporter);
}