@org.hamcrest.Factory
public static org.hamcrest.Matcher<facebook4j.internal.http.HttpParameter[]> hasPostJsonParameter(final java.lang.String name, final java.lang.String expectedJsonObjectSource) {
    facebook4j.internal.org.json.JSONObject expectedJsonObject;
    try {
        expectedJsonObject = new facebook4j.internal.org.json.JSONObject(expectedJsonObjectSource);
    } catch (facebook4j.internal.org.json.JSONException ex) {
        throw new java.lang.AssertionError(("failed to parse object source: " + expectedJsonObjectSource), ex);
    }
    return facebook4j.junit.F4JHttpParameterMatchers.hasPostJsonParameter(name, expectedJsonObject);
}