@org.junit.Test
public void hasCorrectAssociatedClasses() {
    interfaces.IClass test = classes.getClasses().get("testingData/SampleClassForReadingInATest");
    assertEquals(2, test.getAssociatedClasses().size());
    assertTrue(test.getAssociatedClasses().contains("testingData/SampleClassForInitializing"));
    assertTrue(test.getAssociatedClasses().contains("testingData/SampleClassForInitializingTwo"));
}