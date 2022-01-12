@javax.ws.rs.Path(value = "flight/{flight}")
@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.util.List<cs545.airline.model.Airline> findByFlight(@javax.ws.rs.PathParam(value = "flight")
int flight) {
    java.util.List<cs545.airline.model.Airline> a = new java.util.ArrayList<>();
    cs545.airline.model.Flight f = new cs545.airline.model.Flight();
    f.setId(flight);
    a = airlineService.findByFlight(f);
    return a;
}