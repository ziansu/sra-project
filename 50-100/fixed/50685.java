@org.junit.Test
public void getAnnotationArrayTest() throws uk.ac.ebi.brain.error.BrainException {
    java.util.List<java.lang.String> annotations = brain.getAnnotations("G", "testing");
    org.junit.Assert.assertEquals(2, annotations.size());
    java.util.Collections.sort(annotations);
    org.junit.Assert.assertEquals("value1", annotations.get(0));
    org.junit.Assert.assertEquals("value2", annotations.get(1));
}