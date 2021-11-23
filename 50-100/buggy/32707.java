@org.jbehave.core.annotations.Given(value = "Create users to url : $url with body: $body and the name of users start with $user_name with method $method and collars for each user")
public void Create_Users_with_collars(java.lang.String url1, java.lang.String body1, java.lang.String user_name, java.lang.String method1) throws java.io.IOException, java.net.URISyntaxException, org.apache.http.client.ClientProtocolException {
    int items1 = java.lang.Integer.parseInt(java.lang.String.format(jo.aspire.generic.EnvirommentManager.getInstance().getProperty("Number_Of_users")));
    int collars = java.lang.Integer.parseInt(java.lang.String.format(jo.aspire.generic.EnvirommentManager.getInstance().getProperty("Number_Of_collars")));
    for (int i = 1; i <= items1; i++) {
        createUserswithcollars(items1, url1, body1, user_name, method1, collars, i);
    }
}