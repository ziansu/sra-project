@org.junit.Test
public void testDummyParameters() {
    bik.parse("423,452", false, new org.talend.dataquality.duplicating.RandomWrapper(42));
    output = bik.generateMaskedRow(input);
    assertEquals("", output);
}