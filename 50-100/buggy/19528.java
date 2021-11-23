private static void copyDirectoryContents(java.io.File rootDirectory, final java.io.File workingDirectory) throws java.io.IOException {
    for (java.lang.String child : rootDirectory.list()) {
        org.eclipse.emf.compare.diagram.papyrus.tests.egit.AbstractGitMergeTestCase.copyDirectory(new java.io.File(rootDirectory, child), new java.io.File(workingDirectory, child));
    }
}