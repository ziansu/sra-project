@org.junit.Test
public void invalidJsonTest() {
    java.lang.String input = "{\n" + (("\t\"key1\": \"value1\"\n" + "\t\"key2\": \"value2\"\n") + "}");
    java.lang.String result = app.workspace.format.Prettifier.prettify(input, Prettifier.Style.json);
}