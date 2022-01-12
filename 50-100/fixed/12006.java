public static org.eclipse.core.resources.IFile getFile(org.eclipse.jdt.core.IJavaElement element) {
    org.eclipse.core.resources.IResource res = null;
    try {
        while ((res = element.getCorrespondingResource()) == null)
            element = element.getParent();
        
        if (res instanceof org.eclipse.core.resources.IFile)
            return ((org.eclipse.core.resources.IFile) (res));
        
    } catch (org.eclipse.jdt.core.JavaModelException e) {
        org.eclipse.etools.Activator.logError("Failed finding corresponding resource", e);
    }
    return null;
}