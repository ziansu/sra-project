@org.junit.Test
public void shouldReturnSingleElementWhenPropertyIsNotAnArray() {
    final java.util.Properties input = createDummyProperties("key", "singleValue");
    final java.lang.String[] actual = tested.getArray("key", input);
    org.assertj.core.api.Assertions.assertThat(actual).isNotEmpty();
    org.assertj.core.api.Assertions.assertThat(actual).contains(new java.lang.String[]{ "singleValue" });
}