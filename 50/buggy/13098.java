@cartago.INTERNAL_OPERATION
protected synchronized void getDeJure(java.lang.String orgName, cartago.OpFeedbackParam<cartago.ArtifactId> out) throws cartago.OperationException {
    cartago.ArtifactId orgBoardId = lookupArtifact(orgName);
    execLinkedOp(orgBoardId, "getDeJureId", out);
}