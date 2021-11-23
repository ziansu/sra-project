@java.lang.Override
protected boolean initialize(java.lang.Object initObject) {
    if (initObject instanceof org.eclipse.core.resources.IFile) {
        originalFile = ((org.eclipse.core.resources.IFile) (initObject));
        originalFileFullName = originalFile.getName();
        dsProject = originalFile.getProject();
        return true;
    }
    return false;
}