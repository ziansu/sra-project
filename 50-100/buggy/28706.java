@org.junit.Test
public void loggingResponseFilterLogsNonErrors() throws java.lang.Exception {
    final java.io.StringWriter writer = new java.io.StringWriter();
    final java.io.PrintStream captor = new java.io.PrintStream(new org.apache.commons.io.output.WriterOutputStream(writer), true);
    io.restassured.RestAssured.given().filter(io.restassured.filter.log.ResponseLoggingFilter.logResponseTo(captor)).expect().body("greeting", equalTo("Greetings John Doe")).when().get("/greet?firstName=John&lastName=Doe");
    org.junit.Assert.assertThat(writer.toString(), containsString("{\"greeting\":\"Greetings John Doe\"}"));
}