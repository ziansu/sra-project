@org.junit.Test
public void testDQ() throws java.io.IOException {
    java.lang.String csv = "A,B\r\n1,\"2 is \"\"two\"\" \"\r\n\"3  is \"\"three\"\"\",4\r\n";
    java.io.StringReader sr = new java.io.StringReader(csv);
    it.polito.softeng.csvparser.CsvParser p = new it.polito.softeng.csvparser.CsvParser();
    p.addProcessor(CsvParser.printer);
    it.polito.softeng.csvparser.CsvParser.Stats s = p.parse(new java.io.BufferedReader(sr));
    java.lang.System.out.println(CsvParser.printer);
    assertEquals(3, s.rows);
    java.lang.System.out.println(s);
}