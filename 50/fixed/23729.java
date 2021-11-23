@java.lang.Override
public boolean visit(final org.eclipse.core.resources.IResource resource) throws org.eclipse.core.runtime.CoreException {
    analyze(resource, false);
    return true;
}