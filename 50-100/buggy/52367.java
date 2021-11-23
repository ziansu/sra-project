@org.jbehave.core.annotations.Given(value = "Create users to url: $url with body: $body with method $method")
public void createnthItems(java.lang.String url1, java.lang.String body1, java.lang.String method1) throws java.io.IOException, java.net.URISyntaxException, org.apache.http.client.ClientProtocolException {
    int items1 = java.lang.Integer.parseInt(java.lang.String.format(jo.aspire.generic.EnvirommentManager.getInstance().getProperty("Number_Of_users")));
    for (int i = 1; i <= items1; i++) {
        create_Users(items1, url1, body1, method1, i);
    }
}