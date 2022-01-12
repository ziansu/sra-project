private void putError(org.jetbrains.mps.openapi.model.SNode node, jetbrains.mps.errors.IErrorReporter reporter) {
    getTypeErrorComponent().addError(node, reporter);
}