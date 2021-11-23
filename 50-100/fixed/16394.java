@org.junit.Test
public void testRemoveFile() throws challengetask.group02.controllers.FsException, java.io.IOException, java.lang.ClassNotFoundException {
    challengetask.group02.controllers.TreeControllerTest.controller.createFile("/FileToRemove");
    assertTrue(challengetask.group02.controllers.TreeControllerTest.controller.readDir("/").contains("FileToRemove"));
    challengetask.group02.fsstructure.Entry newEntry = challengetask.group02.controllers.TreeControllerTest.controller.findEntry("/FileToRemove");
    challengetask.group02.controllers.TreeControllerTest.controller.deleteFile("/FileToRemove");
    assertTrue((!(challengetask.group02.controllers.TreeControllerTest.controller.readDir("/").contains("FileToRemove"))));
    assertTrue(((getEntryFromID(newEntry.getID())) == null));
}