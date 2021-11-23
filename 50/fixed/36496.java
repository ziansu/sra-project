@org.junit.Before
public void createTestFile() {
    java.io.File file = new java.io.File(xyz.enhorse.taskapi.TaskFileTest.TEST_FILE_NAME);
    xyz.enhorse.taskapi.CommonTestTools.createFileWithSize(file, xyz.enhorse.taskapi.CommonTestTools.TEST_FILE_SIZE);
    taskFile = new xyz.enhorse.taskapi.TaskFile(null, file.toPath());
}