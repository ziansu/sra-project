@java.lang.Override
protected void setUp() throws java.lang.Exception {
    org.eclipse.core.runtime.IPath testrpath = new org.eclipse.core.runtime.Path("testresources");
    createProjectClone(fJarProject, testrpath.append(fJarProject).toString(), false);
    org.eclipse.jdt.debug.tests.sourcelookup.JarSourceLookupTests.fgJarProject = createJavaProjectClone(RefPjName, testrpath.append(RefPjName).toString(), JavaProjectHelper.J2SE_1_4_EE_NAME, false);
}