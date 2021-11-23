@java.lang.Override
public void afterCreateVersion(final org.alfresco.service.cmr.repository.NodeRef versionableNode, org.alfresco.service.cmr.version.Version version) {
    checkForVirus(versionableNode);
}