@org.junit.Test
public void testParseFrom() throws java.lang.Exception {
    java.lang.String input = "from(test1)";
    model.data.DataModel model = new model.data.DataModel();
    model.data.DataTable test1 = new model.data.DataTable("test1");
    model.add(test1);
    language.Parser parser = new language.Parser();
    model.data.process.DataProcess process = parser.parse(input, model);
    process.setDataModel(model);
    model.data.Table result = process.process();
    org.junit.Assert.assertEquals(test1, result);
}