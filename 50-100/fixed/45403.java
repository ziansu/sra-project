@org.junit.Test
public void getResponse() throws java.lang.Exception {
    java.lang.String expectedResponse = (((((((("HTTP/1.1 200 OK" + (utilities.FormattedStrings.CRLF)) + "Content-Type: text/html") + (utilities.FormattedStrings.CRLF)) + "Content-Length: 21") + (utilities.FormattedStrings.CRLF)) + "Connection: close") + (utilities.FormattedStrings.CRLF)) + (utilities.FormattedStrings.CRLF)) + "<h1>Hello World!</h1>";
    junit.framework.TestCase.assertEquals(expectedResponse, response.responseString());
}