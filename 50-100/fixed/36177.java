@org.junit.Test
public void testQuoted() throws java.io.IOException {
    java.lang.String csv = "\"A\",B\n1,\"2\"\n\"3\",4";
    java.io.StringReader sr = new java.io.StringReader(csv);
    it.polito.softeng.csvparser.CsvParser p = new it.polito.softeng.csvparser.CsvParser();
    p.addProcessor(CsvParser.printer);
    it.polito.softeng.csvparser.CsvParser.Stats s = p.parse(new java.io.BufferedReader(sr));
    assertEquals(3, s.rows);
    java.lang.System.out.println(s);
}