@org.junit.Before
public void setUp() throws java.lang.Exception {
    project = java.nio.file.Files.createTempDirectory("BBCNews_");
    java.nio.file.Path topicPlace = new java.io.File("bbc").toPath();
    testSubject = new tw.edu.ncu.CJ102.CoreProcess.BBCNewsPopulator(project, topicPlace);
}