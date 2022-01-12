protected cartago.ArtifactId getDeJure(java.lang.String orgName) throws cartago.OperationException {
    cartago.ArtifactId orgBoardId = lookupArtifact(orgName);
    cartago.OpFeedbackParam<cartago.ArtifactId> out = new cartago.OpFeedbackParam<cartago.ArtifactId>();
    execLinkedOp(orgBoardId, "getDeJureId", out);
    return out.get();
}