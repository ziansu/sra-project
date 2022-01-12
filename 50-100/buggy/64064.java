@java.lang.Override
@org.junit.After
public void tearDownProjects() throws java.lang.Exception {
    org.eclipse.core.resources.IProject project = getProject();
    project.delete(true, new org.eclipse.core.runtime.NullProgressMonitor());
    java.lang.System.out.println(("Deleting projet " + (project.getName())));
    dialogMonitor.stopMonitoring();
    super.tearDownProjects();
}