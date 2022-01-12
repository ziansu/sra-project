@org.junit.Test
public void loggingResponseFilterDoesntLogWhenSpecifiedMatcherIsNotFulfilled() throws java.lang.Exception {
    final java.io.StringWriter writer = new java.io.StringWriter();
    final java.io.PrintStream captor = new java.io.PrintStream(new org.apache.commons.io.output.WriterOutputStream(writer), true);
    given().filter(io.restassured.filter.log.ResponseLoggingFilter.logResponseToIfMatches(captor, equalTo(400))).expect().body("greeting", equalTo("Greetings John Doe")).when().get("/greet?firstName=John&lastName=Doe");
    org.junit.Assert.assertThat(writer.toString(), is(""));
}