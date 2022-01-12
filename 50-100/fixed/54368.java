public void testInvalidBuildFileAsImportProjectPath() {
    boolean caught = false;
    final java.nio.file.Path filePath = java.nio.file.Paths.get(getProjectPath(), "..", "invalid-build-file", "BUILD");
    final java.lang.String badBuildFile = filePath.normalize().toString();
    java.lang.System.out.println(badBuildFile);
    try {
        myFromPantsControl.onLinkedProjectPathChange(badBuildFile);
    } catch (com.twitter.intellij.pants.PantsException e) {
        caught = true;
    }
    assertTrue("PantsException not thrown on invalid BUILD file", caught);
    assertPantsProjectNotFound();
}