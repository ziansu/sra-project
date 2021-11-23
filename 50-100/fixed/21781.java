private boolean fileIsSupportedCamel(final java.lang.Object item) {
    try {
        final org.eclipse.core.resources.IResource resource = ((org.eclipse.core.resources.IResource) (item));
        final java.io.File testFile = new java.io.File(resource.getLocationURI());
        if (testFile.exists()) {
            return org.jboss.tools.fuse.transformation.editor.internal.util.CamelFileTypeHelper.isSupportedCamelFile(resource.getProject(), resource.getProjectRelativePath().toPortableString());
        }
    } catch (final java.lang.Exception e) {
    }
    return false;
}