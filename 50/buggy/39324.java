@org.junit.Test
public void testKeywords() {
    org.junit.Assert.assertEquals(magic.data.Keyword.class, magic.compiler.Reader.read(":foo").getClass());
}