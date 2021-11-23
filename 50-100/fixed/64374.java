@org.junit.Before
public void before() {
    path = "src/test/data/excelparsertestfiles/";
    cols = new java.util.ArrayList<context.healthinformatics.Parser.Column>();
    cols.add(new context.healthinformatics.Parser.Column(0, "value", "Integer"));
    cols.add(new context.healthinformatics.Parser.Column(1, "date", "String"));
    cols.add(new context.healthinformatics.Parser.Column(2, "time", "String"));
}