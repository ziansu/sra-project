@org.junit.Test
public void shouldParseValidPropertyOnDefaultDelimiter() {
    final java.util.Properties input = createDummyProperties("key", "test,values");
    final java.lang.String[] actual = tested.getArray("key", input);
    org.assertj.core.api.Assertions.assertThat(actual).isNotEmpty();
    org.assertj.core.api.Assertions.assertThat(actual).contains(new java.lang.String[]{ "test" , "values" });
}