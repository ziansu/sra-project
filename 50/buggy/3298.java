public static boolean isRemoteProject(org.eclipse.core.resources.IResource resource) {
    boolean isRemote = false;
    try {
        isRemote = org.eclipse.ptp.internal.gem.util.GemUtilities.getCurrentProject().hasNature(RemoteMakeNature.NATURE_ID);
    } catch (final org.eclipse.core.runtime.CoreException e) {
        org.eclipse.ptp.internal.gem.util.GemUtilities.logExceptionDetail(e);
    }
    return isRemote;
}