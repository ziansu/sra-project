private void assertPresentAndTrue(com.fasterxml.jackson.databind.node.ObjectNode node, java.lang.String fieldName) {
    assertThat(node.has(fieldName)).isTrue();
    assertThat(node.get(fieldName).isBoolean()).isTrue();
    assertThat(node.get(fieldName).booleanValue()).isTrue();
}