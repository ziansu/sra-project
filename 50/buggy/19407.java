@cartago.INTERNAL_OPERATION
protected synchronized void deployDeJureNorms() throws cartago.OperationException {
    cartago.OpFeedbackParam<npl.Scope> scope = new cartago.OpFeedbackParam<npl.Scope>();
    execLinkedOp(deJure, "createNPLScope", scope);
    nengine.loadNP(scope.get());
}