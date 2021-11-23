@org.junit.Test
public void defaultStyleJsonTest() {
    java.lang.String input = "{\"key1\":\"value1\",\"inner\":{\"innerKey1\":\"innerValue1\"},\"list\":[{\"entry\":\"1\"},{\"entry\":\"2\"}]}";
    java.lang.String result = app.workspace.format.Prettifier.prettify(input, Prettifier.Style.unknown);
    org.junit.Assert.assertThat(result, org.hamcrest.core.Is.is(input));
}