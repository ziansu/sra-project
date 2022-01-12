@org.junit.Test
public void loadNonExistingFile() {
    java.lang.String filePath = "nonexisting.xml";
    commandBox.runCommand(("load " + filePath));
    assertResultMessage(java.lang.String.format(LoadCommand.MESSAGE_FILE_NONEXISTENT, filePath));
}