public void publish(final java.lang.String nodeUUID) throws javax.jcr.RepositoryException {
    org.jahia.services.content.JCRPublicationService.getInstance().publishByMainId(nodeUUID, Constants.EDIT_WORKSPACE, Constants.LIVE_WORKSPACE, null, true, java.util.Collections.singletonList(""));
}