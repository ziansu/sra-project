@org.junit.Test
public void testSequenceOfNulls() {
    org.obiba.magma.ValueSequence sequence = org.obiba.magma.type.TextType.get().sequenceOf("\"\",\"\"");
    assertSequence(sequence, null, null);
}