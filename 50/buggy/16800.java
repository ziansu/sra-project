@org.junit.AfterClass
public static void tearDownAfterClass() throws java.lang.Exception {
    java.lang.System.out.println("Exiting, cleaning up folders");
    if (storagetest.PreparationCleanUp.cleanUp(storagetest.DirectoryHandlerTest.newBaseDirectory)) {
        storagetest.DirectoryHandlerTest.manualCleanUp();
        java.lang.System.out.println("Clean up completed. bye");
    }
}