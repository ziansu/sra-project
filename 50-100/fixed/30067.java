@org.testng.annotations.Test
public void title_01() {
    java.io.StringWriter strWriter = new java.io.StringWriter();
    com.github.rvesse.airline.io.printers.TroffPrinter printer = new com.github.rvesse.airline.io.printers.TroffPrinter(new java.io.PrintWriter(strWriter));
    printer.start("Test", 1);
    printer.finish();
    java.lang.String expected = org.apache.commons.lang3.StringUtils.join(new java.lang.String[]{ ".TH \"Test\" \"1\" \"\" \"\" \"\"" , "" }, '\n');
    org.testng.Assert.assertEquals(strWriter.toString(), expected);
}