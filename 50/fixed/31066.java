@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void shouldNotParserNullProperties() {
    final java.util.Properties input = null;
    tested.getArray("name", input);
}