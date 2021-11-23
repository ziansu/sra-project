@java.lang.Override
public org.eclipse.jdt.core.IClasspathAttribute performEdit(org.eclipse.swt.widgets.Shell shell, org.eclipse.jdt.internal.ui.wizards.buildpaths.ClasspathAttributeAccess attribute) {
    java.lang.String initialLocation = attribute.getClasspathAttribute().getValue();
    org.eclipse.core.runtime.IPath locationPath = (initialLocation == null) ? null : new org.eclipse.core.runtime.Path(initialLocation);
    org.eclipse.core.runtime.IPath newPath = org.eclipse.jdt.ui.wizards.BuildPathDialogAccess.configureExternalAnnotationsAttachment(shell, locationPath);
    if (null == newPath)
        return null;
    
    return org.eclipse.jdt.core.JavaCore.newClasspathAttribute(org.eclipse.jdt.core.IClasspathAttribute.EXTERNAL_ANNOTATION_PATH, newPath.toPortableString());
}