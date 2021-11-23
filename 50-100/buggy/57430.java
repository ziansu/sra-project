@java.lang.Override
public boolean isLinkCreationNeeded(java.lang.Object targetFolder, java.io.File file) throws de.jcup.egradle.core.virtualroot.VirtualRootProjectException {
    org.apache.commons.lang3.Validate.notNull(targetFolder, "'targetFolder' may not be null");
    org.apache.commons.lang3.Validate.notNull(file, "'file' may not be null");
    boolean creationNeeded = internalCheckIfLinkMustBeCreated(targetFolder, file);
    if (!creationNeeded) {
        getCreationMonitor().worked((++(createdLinks)));
    }
    return creationNeeded;
}