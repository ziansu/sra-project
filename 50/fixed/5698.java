@cucumber.api.java.en.Given(value = "^I am logged in as a \"([^\"]*)\" user in Omnivue$")
public void logging_in_user(java.lang.String userType) {
    java.lang.String url = Page.envData.getFieldValue("omnivue-url");
    java.lang.System.out.println(("url value is" + url));
    enduser.is_in_omnivue_login_page(url);
    loginpage.shouldExist(loginpage);
    enduser.logs_in_as_a(userType);
}