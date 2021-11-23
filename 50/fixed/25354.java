public java.util.List<hudson.plugins.tfs.model.ChangeSet> getDetailedHistory(final java.lang.String singleVersionSpec) {
    final com.microsoft.tfs.core.clients.versioncontrol.specs.version.VersionSpec toVersion = com.microsoft.tfs.core.clients.versioncontrol.specs.version.VersionSpec.parseSingleVersionFromSpec(singleVersionSpec, null);
    return getVCCHistory(toVersion, toVersion, true, 1);
}