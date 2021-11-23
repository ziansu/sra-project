private void assertFalse(java.lang.String leftHand, test.org.uva.taxfree.ql.semantics.Operator operator, java.lang.String rightHand) {
    assertThat(leftHand, operator, rightHand, "false");
}