@org.junit.Test
public void basics() {
    org.junit.Assert.assertEquals(filter.Parser.parse(null), null);
    org.junit.Assert.assertEquals(filter.Parser.parse(""), Qualifier.EMPTY);
}