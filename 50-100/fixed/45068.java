@org.junit.experimental.theories.DataPoints
public static context.healthinformatics.Parser.Parser[] parsers() {
    context.healthinformatics.Parser.XMLParser xmlp = new context.healthinformatics.Parser.XMLParser("test");
    context.healthinformatics.Parser.TXTParser txtp = new context.healthinformatics.Parser.TXTParser("test", 0, null, new java.util.ArrayList<context.healthinformatics.Parser.Column>(), "docname");
    context.healthinformatics.Parser.ExcelParser exlp = new context.healthinformatics.Parser.ExcelParser("test", 0, null, 0, "docname");
    return new context.healthinformatics.Parser.Parser[]{ xmlp , txtp , exlp };
}