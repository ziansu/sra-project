private org.eclipse.team.internal.ui.mapping.IResource[] getResources(org.eclipse.team.internal.ui.mapping.ISynchronizationContext context, org.eclipse.core.runtime.IPath[] paths) {
    java.util.List resources = new java.util.ArrayList();
    for (int i = 0; i < (paths.length); i++) {
        org.eclipse.core.runtime.IPath path = paths[i];
        org.eclipse.team.internal.ui.mapping.IResource resource = getResource(context, path);
        if (resource != null)
            resources.add(resource);
        
    }
    return ((org.eclipse.team.internal.ui.mapping.IResource[]) (resources.toArray(new org.eclipse.team.internal.ui.mapping.IResource[resources.size()])));
}