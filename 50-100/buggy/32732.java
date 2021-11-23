private boolean getBuildStatus(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.resources.IProject project) {
    com.liferay.ide.core.IBundleProject bundleProject = com.liferay.ide.core.LiferayCore.create(com.liferay.ide.core.IBundleProject.class, project);
    org.eclipse.core.runtime.IPath outputBundlepath = null;
    try {
        outputBundlepath = bundleProject.getOutputBundle(false, monitor);
    } catch (java.lang.Exception e) {
    }
    if ((outputBundlepath != null) && (!(outputBundlepath.isEmpty()))) {
        return true;
    }
    return false;
}