@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.TEXT_PLAIN)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_PLAIN)
@javax.ws.rs.Path(value = "deleteEntity")
public javax.ws.rs.core.Response deleteEntity(java.lang.String body, @javax.ws.rs.QueryParam(value = "name")
java.lang.String userName, @javax.ws.rs.QueryParam(value = "password")
java.lang.String pwd) {
    java.lang.System.out.println(body);
    test2.XMLCreator xmlc = new test2.XMLCreator(userName, pwd);
    return returnString(test2.XMLCreator.prettyFormat(xmlc.deleteEntity(body)));
}