@org.junit.Test
public void testGetParameterValuesMultiple() {
    java.lang.System.out.println("getParameterValues multiple");
    java.lang.String query = "a=b&c=d&a=f";
    java.util.List<java.lang.String> expResult = null;
    assertThat(jpt.app01.QueryParser.getParameterValues(query, "a"), hasItems("b", "f"));
    assertThat(jpt.app01.QueryParser.getParameterValues(query, "c"), hasItems("d"));
}