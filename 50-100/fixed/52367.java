@org.jbehave.core.annotations.Given(value = "Create $items Items to url: $url with body: $body with method $method")
public void createnthItems(int items1, java.lang.String url1, java.lang.String body1, java.lang.String method1) throws java.io.IOException, java.net.URISyntaxException, org.apache.http.client.ClientProtocolException {
    for (i = 1; (i) <= items1; (i)++) {
        create_Users(items1, url1, body1, method1);
    }
}