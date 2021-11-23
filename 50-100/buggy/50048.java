@javax.ws.rs.DELETE
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_PLAIN)
public java.lang.String deleteTicket(@javax.ws.rs.QueryParam(value = "pnr")
int pnr, @javax.ws.rs.QueryParam(value = "passengerName")
java.lang.String passengerName, @javax.ws.rs.QueryParam(value = "vt")
int[] vt) {
    management.checkTimestamp(vt);
    kaankara_cs403_projph1.passenger.Passenger passenger = management.getPassenger(pnr);
    for (int i = 0; i < (passenger.getTicketList().size()); i++) {
        management.cancelTicket(passenger.getTicketList().get(i), passenger.getFlightNum());
    }
    management.deletePassenger(pnr);
    return "Ticket(s)canceled.";
}