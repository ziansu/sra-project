@org.junit.Test
public void testGetParameterValues() {
    java.lang.System.out.println("getParameterValues");
    java.lang.String query = "a=b&c=d&e=f";
    assertThat(jpt.app01.QueryParser.getParameterValues(query, "a"), hasItems("b"));
    assertThat(jpt.app01.QueryParser.getParameterValues(query, "c"), hasItems("d"));
    assertThat(jpt.app01.QueryParser.getParameterValues(query, "e"), hasItems("f"));
}