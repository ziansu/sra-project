@org.junit.Test
public void shouldReturnEmptyOptionalWhenNoPropertyWasFound() {
    final java.util.Properties input = createDummyProperties("Will", "not,look,for,that");
    final java.util.Optional<java.lang.String[]> actual = tested.getArray(input, "test", ",");
    org.assertj.core.api.Assertions.assertThat(actual).isEmpty();
}