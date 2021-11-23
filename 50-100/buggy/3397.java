@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/doUpdate")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.String doUpdate(@javax.ws.rs.QueryParam(value = "user_id")
java.lang.String uid, @javax.ws.rs.QueryParam(value = "urldata")
java.lang.String urldata) {
    java.lang.String response = "";
    if (checkCredentials(uid)) {
        if ((updateUrl(urldata)) == 0) {
            response = com.prgguru.jersey.Utility.constructJSON("update", true);
        }else {
            response = com.prgguru.jersey.Utility.constructJSON("update", false, "bad url map");
        }
    }else {
        response = com.prgguru.jersey.Utility.constructJSON("update", false, "not logged in or not registered");
    }
    return response;
}