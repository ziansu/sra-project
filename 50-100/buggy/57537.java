protected void assertReportedBugs(java.lang.String expectedBugType, int expectedBugCount, org.eclipse.core.resources.IProject project) throws org.eclipse.core.runtime.CoreException {
    int seenBugCount = 0;
    edu.umd.cs.findbugs.SortedBugCollection bugs = de.tobject.findbugs.FindbugsPlugin.getBugCollection(project, null, false);
    for (edu.umd.cs.findbugs.BugInstance bug : bugs) {
        if (expectedBugType.equals(bug.getType())) {
            seenBugCount++;
        }
    }
    org.junit.Assert.assertEquals(((((("Expected " + expectedBugCount) + " of bugs ") + expectedBugType) + " but seen ") + seenBugCount), expectedBugCount, seenBugCount);
}