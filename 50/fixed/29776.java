@cucumber.api.java.en.Then(value = "^i (.*) the get details to amend (.*)$")
public void iPutTheGetDetailsToAmend(java.lang.String requestType, java.lang.String identifier) throws java.lang.Throwable {
    definitions.MyStepdefs.bs.putBorrowerDetails(requestType, identifier);
}