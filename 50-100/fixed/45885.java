@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response creatTicket(HW12Rest.Ticket ticket) throws java.sql.SQLException {
    try {
        entryManager.addTicket(ticket);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return javax.ws.rs.core.Response.status(200).entity("saved successfully").build();
}