public java.util.ArrayList<org.sleuthkit.datamodel.BlackboardArtifact> getBlackboardArtifacts(org.sleuthkit.datamodel.BlackboardArtifact.ARTIFACT_TYPE artifactType, long obj_id) throws org.sleuthkit.datamodel.TskCoreException {
    return getBlackboardArtifacts(artifactType.getTypeID(), obj_id);
}