public org.eclipse.osee.framework.core.data.IArtifactType[] getArtifactTypeFilter() {
    org.eclipse.osee.framework.ui.skynet.search.QuickSearchOptionComposite.IOptionConfigurationHandler<?> handler = getConfiguration(org.eclipse.osee.framework.ui.skynet.search.QuickSearchOptionComposite.SearchOption.Artifact_Types.asLabel());
    org.eclipse.osee.framework.core.data.IArtifactType[] types = ((org.eclipse.osee.framework.core.data.IArtifactType[]) (handler.getConfigData()));
    return isArtifactTypeFilterEnabled() ? types : new org.eclipse.osee.framework.core.data.IArtifactType[0];
}