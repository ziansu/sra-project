public void addClasspathEntry(org.eclipse.jdt.core.IClasspathEntry classpathEntry) throws java.lang.Exception {
    if (java.util.Arrays.asList(javaProject.getRawClasspath()).contains(classpathEntry))
        return ;
    
    org.eclipse.jdt.core.IClasspathEntry[] entries = ((org.eclipse.jdt.core.IClasspathEntry[]) (org.codehaus.groovy.eclipse.core.util.ArrayUtils.add(javaProject.getRawClasspath(), classpathEntry)));
    org.eclipse.jdt.core.groovy.tests.SimpleProgressMonitor monitor = new org.eclipse.jdt.core.groovy.tests.SimpleProgressMonitor(("Add " + classpathEntry));
    javaProject.setRawClasspath(entries, monitor);
    monitor.waitForCompletion();
}