@java.lang.Override
public boolean visit(org.eclipse.core.resources.IResourceDelta delta) throws org.eclipse.core.runtime.CoreException {
    final org.eclipse.core.resources.IResource resource = delta.getResource();
    if (resource.isDerived())
        return true;
    
    switch (delta.getKind()) {
        case org.eclipse.core.resources.IResourceDelta.ADDED :
        case org.eclipse.core.resources.IResourceDelta.REMOVED :
        case org.eclipse.core.resources.IResourceDelta.CHANGED :
            cmakelistsAffected |= de.marw.cdt.cmake.core.internal.CMakelistsVisitor.checkCMakeLists(resource);
            break;
    }
    return cmakelistsAffected ? false : true;
}