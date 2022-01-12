@org.junit.Test
public void testWrongParameter() {
    try {
        bik.parse("0, 8", false, new org.talend.dataquality.duplicating.RandomWrapper(42));
        fail(("should get exception with input " + (bik.parameters)));
    } catch (java.lang.Exception e) {
        assertTrue("expect illegal argument exception ", (e instanceof java.lang.IllegalArgumentException));
    }
    output = bik.generateMaskedRow(input);
    assertEquals("", output);
}