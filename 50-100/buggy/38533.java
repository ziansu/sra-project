@org.junit.Test
public void loggingResponseFilterLogsErrors() throws java.lang.Exception {
    final java.io.StringWriter writer = new java.io.StringWriter();
    final java.io.PrintStream captor = new java.io.PrintStream(new org.apache.commons.io.output.WriterOutputStream(writer), true);
    io.restassured.RestAssured.given().filter(io.restassured.filter.log.ResponseLoggingFilter.logResponseTo(captor)).and().expect().body(equalTo("ERROR")).when().get("/409");
    org.junit.Assert.assertThat(writer.toString(), containsString("ERROR"));
}