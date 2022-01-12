@org.junit.Test
public void shouldTrapJavascriptErrorAndWrapThemInErrors() throws java.lang.Exception {
    smartrics.rest.client.RestResponse response = createResponse();
    smartrics.rest.fitnesse.fixture.support.JavascriptWrapper h = new smartrics.rest.fitnesse.fixture.support.JavascriptWrapper();
    try {
        h.evaluateExpression(response, "some erroneous javascript");
        org.junit.Assert.fail("Must throw a Javascript Exception");
    } catch (smartrics.rest.fitnesse.fixture.support.JavascriptException e) {
    }
}