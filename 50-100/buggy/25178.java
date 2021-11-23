@java.lang.Override
public boolean select(final org.eclipse.jface.viewers.Viewer p_viewer, final java.lang.Object p_parentElement, final java.lang.Object p_element) {
    if (((fileExtensions) != null) && (p_element instanceof org.eclipse.core.resources.IResource)) {
        for (final java.lang.String ext : fileExtensions) {
            final java.lang.String resExt = ((org.eclipse.core.resources.IResource) (p_element)).getFileExtension();
            if ((resExt == null) || (ext.equalsIgnoreCase(("*." + resExt)))) {
                return true;
            }
        }
        return false;
    }
    return true;
}