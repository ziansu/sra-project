@org.jbehave.core.annotations.When(value = "Retrieve Json path $expression response")
@org.jbehave.core.annotations.Then(value = "Retrieve Json path $expression response")
public void RetrieveJsonvalue(java.lang.String expression) throws org.json.JSONException {
    response = com.jayway.jsonpath.JsonPath.parse(StringjsonResponse).read(expression, java.lang.String.class);
    java.lang.System.err.println(("The value for the created item is: " + (JsonValue)));
}