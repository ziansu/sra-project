@org.junit.Test
public void testConvertWithMissingSource() {
    java.lang.Object destinationObject = new java.lang.Object();
    java.lang.Object actualObject = objectUnderTest.convert(destinationObject, null, java.lang.Object.class, java.lang.Object.class);
    assertNull(actualObject);
}