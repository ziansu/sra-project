@org.junit.Test
public void basics() {
    org.junit.Assert.assertEquals(filter.Parser.parse(null), Qualifier.EMPTY);
    org.junit.Assert.assertEquals(filter.Parser.parse(""), Qualifier.EMPTY);
}