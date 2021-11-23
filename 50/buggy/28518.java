protected void clearBugsState() throws org.eclipse.core.runtime.CoreException {
    de.tobject.findbugs.reporter.MarkerUtil.removeMarkers(de.tobject.findbugs.test.AbstractPluginTest.getProject());
    de.tobject.findbugs.FindbugsPlugin.getBugCollection(de.tobject.findbugs.test.AbstractPluginTest.getProject(), null, false).clearBugInstances();
}