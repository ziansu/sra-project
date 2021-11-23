@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.String getProfile(@javax.ws.rs.HeaderParam(value = "accountID")
java.lang.String accountId) throws java.lang.Exception {
    java.lang.System.out.println(("account ID " + accountId));
    beans.AccountID accountID = new beans.AccountID(accountId);
    accountID.setAccountID(accountId);
    beans.Profile profile = mongoOperator.getProfile(accountID);
    org.codehaus.jackson.map.ObjectMapper mapper = new org.codehaus.jackson.map.ObjectMapper();
    java.lang.String jsonInString = null;
    try {
        jsonInString = mapper.writeValueAsString(profile);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return jsonInString;
}