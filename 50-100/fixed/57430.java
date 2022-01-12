@java.lang.Override
public boolean isLinkCreationNeeded(java.lang.Object targetFolder, java.io.File file) throws de.jcup.egradle.core.virtualroot.VirtualRootProjectException {
    notNull(targetFolder, "'targetFolder' may not be null");
    notNull(file, "'file' may not be null");
    boolean creationNeeded = internalCheckIfLinkMustBeCreated(targetFolder, file);
    if (!creationNeeded) {
        getCreationMonitor().worked((++(createdLinks)));
    }
    return creationNeeded;
}