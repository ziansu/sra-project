@org.junit.Test
public void loadNewFile() throws java.lang.Exception {
    java.lang.String filepath = getTempFilePath("newfile.xml");
    commandBox.runCommand(("load new " + filepath));
    org.junit.Assert.assertTrue(project.taskcrusher.commons.util.FileUtil.isFileExists(new java.io.File(filepath)));
}