@org.junit.Test
public void testDecodeException() throws java.lang.Exception {
    webClient.setJavaScriptEnabled(true);
    webClient.setJavaScriptTimeout(60000);
    com.gargoylesoftware.htmlunit.html.HtmlPage page = webClient.getPage(((webUrl) + "/faces/issue2179-page2.xhtml"));
    com.gargoylesoftware.htmlunit.html.HtmlSubmitInput button = ((com.gargoylesoftware.htmlunit.html.HtmlSubmitInput) (page.getElementById("form:submit")));
    page = button.click();
    webClient.waitForBackgroundJavaScript(60000);
    java.lang.System.out.println(page.asXml());
    assertTrue(page.asXml().contains("Name: form:submit Error: serverError"));
}