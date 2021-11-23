@javax.ws.rs.Path(value = "flight/{id}")
@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.util.List<cs545.airline.model.Airline> findByFlight(@javax.ws.rs.PathParam(value = "id")
int id) {
    java.util.List<cs545.airline.model.Airline> a = new java.util.ArrayList<>();
    cs545.airline.model.Flight f = new cs545.airline.model.Flight();
    f.setId(id);
    a = airlineService.findByFlight(f);
    return a;
}