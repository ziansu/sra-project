@java.lang.SuppressWarnings(value = "restriction")
public static org.eclipse.core.resources.IFolder configureProjectWithXtext(org.eclipse.core.resources.IProject project, java.lang.String sourceFolder) throws org.eclipse.core.runtime.CoreException {
    org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.addNature(project.getProject(), XtextProjectHelper.NATURE_ID);
    org.eclipse.core.resources.IFolder folder = project.getProject().getFolder(sourceFolder);
    if (!(folder.exists())) {
        folder.create(true, true, null);
    }
    return folder;
}