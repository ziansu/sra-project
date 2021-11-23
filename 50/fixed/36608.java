protected void dispose(cartago.ArtifactId aid) throws cartago.OperationException {
    try {
        env.disposeArtifact(this.getCurrentOpAgentId(), aid);
    } catch (java.lang.Exception ex) {
        throw new cartago.OperationException(("disposeArtifact failed: " + aid));
    }
}