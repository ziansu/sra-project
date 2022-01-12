@org.junit.Test
public void testDeleteFile() throws java.io.IOException {
    java.io.File file = new java.io.File(((org.kitodo.filemanagement.FileManagementTest.testFolder) + "testDelete.txt"));
    java.io.FileOutputStream os = new java.io.FileOutputStream(file);
    os.write(5);
    os.flush();
    os.close();
    org.junit.Assert.assertTrue("File not created", file.exists());
    org.kitodo.filemanagement.FileManagement fileManagement = new org.kitodo.filemanagement.FileManagement();
    fileManagement.delete(file.toURI());
    org.junit.Assert.assertFalse("File not deleted", file.exists());
}