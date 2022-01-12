@org.junit.Before
public void before() {
    path = "src/test/data/excelparsertestfiles/";
    cols = new java.util.ArrayList<context.healthinformatics.Parser.Column>();
    cols.add(new context.healthinformatics.Parser.Column(2, "value", "Integer"));
    cols.add(new context.healthinformatics.Parser.Column(context.healthinformatics.Parser.ExcelParserTest.FIVE, "date", "String"));
    cols.add(new context.healthinformatics.Parser.Column(context.healthinformatics.Parser.ExcelParserTest.SIX, "time", "String"));
}