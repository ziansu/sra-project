@org.testng.annotations.Test
public void testRootCollectionMixedIds() throws com.fasterxml.jackson.core.JsonProcessingException {
    java.lang.String graphQLRequest = "mutation { " + ((("book(op:UPSERT, data: [{id: \"1\", title: \"my id\"}, {id: \"42\", title: \"xyz\"}, {title: \"abc\"}]) { " + "title ") + "} ") + "}");
    java.lang.String expectedResponse = "{" + ((((((("\"book\":[{" + "\"title\":\"my id\"") + "},{") + "\"title\":\"xyz\"") + "},{") + "\"title\":\"abc\"") + "}]") + "}");
    assertQueryEquals(graphQLRequest, expectedResponse);
}