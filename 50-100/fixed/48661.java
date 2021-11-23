@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/events")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.util.List<eventplannerPD.Event> getEvents(@javax.ws.rs.DefaultValue(value = "0")
@javax.ws.rs.QueryParam(value = "page")
java.lang.String page, @javax.ws.rs.DefaultValue(value = "10")
@javax.ws.rs.QueryParam(value = "per_page")
java.lang.String perPage) {
    java.util.List<eventplannerPD.Event> events = eventplannerDAO.EventDAO.listEvents();
    com.owlike.genson.Genson gen = new com.owlike.genson.Genson();
    gen.serialize(events);
    log.log(events.toString());
    log.logJAXB();
    return events;
}