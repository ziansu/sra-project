@org.junit.Test
public void basics() {
    assertEquals(filter.Parser.parse(null), Qualifier.EMPTY);
    assertEquals(filter.Parser.parse(""), Qualifier.EMPTY);
}