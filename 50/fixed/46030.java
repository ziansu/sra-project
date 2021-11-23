@org.junit.Test
public void shouldReturnEmptyOptionalWhenNoPropertyWasFound() {
    final java.util.Properties input = createDummyProperties("Will", "not,look,for,that");
    final java.lang.String[] actual = tested.getArray("test", input);
    org.assertj.core.api.Assertions.assertThat(actual).isEmpty();
}