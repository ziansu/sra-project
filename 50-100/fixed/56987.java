@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/modif/{timestamp}/{cd}")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.String getModified(@javax.ws.rs.PathParam(value = "timestamp")
long timestamp, @javax.ws.rs.PathParam(value = "cd")
java.lang.Integer cd) {
    if (timestamp == 0)
        return getAll(cd);
    
    if ((context.getAttribute(kobjectClass.getSimpleName())) == null)
        context.setAttribute(kobjectClass.getSimpleName(), new java.util.Date().getTime());
    
    if (((long) (context.getAttribute(kobjectClass.getSimpleName()))) > timestamp)
        return getAll(cd);
    
    return "false";
}