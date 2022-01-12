@javax.ws.rs.Path(value = "update")
@javax.ws.rs.Consumes(value = "application/json")
@javax.ws.rs.Produces(value = "application/json")
@javax.ws.rs.POST
public cs545.airline.model.Airline updateAirline(cs545.airline.model.Airline airline) {
    airlineService.update(airline);
    return airline;
}