public static boolean isCloudScaleProject(org.eclipse.core.resources.IProject project) {
    if (!(project.isAccessible())) {
        return false;
    }
    try {
        if (project.isNatureEnabled(CloudScaleConstants.PROJECT_NATURE_ID)) {
            return true;
        }
    } catch (org.eclipse.core.runtime.CoreException e) {
        e.printStackTrace();
    }
    return false;
}