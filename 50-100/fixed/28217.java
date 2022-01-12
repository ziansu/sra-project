@org.junit.Test
public void hasCorrectAssociatedClasses() {
    interfaces.IClass test = classes.getClasses().get("testingData/SampleClassForReadingInATest");
    assertEquals(1, test.getAssociatedClasses().size());
    assertTrue(test.getAssociatedClasses().contains("testingData/SampleClassForInitializingTwo"));
}