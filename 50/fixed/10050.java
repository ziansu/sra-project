@java.lang.Override
public void apply(final org.eclipse.emf.common.util.URI deleted) {
    java.util.Set<org.eclipse.emf.common.util.URI> _deletedFiles = xtextBuildResultCollector.getDeletedFiles();
    _deletedFiles.add(deleted);
}