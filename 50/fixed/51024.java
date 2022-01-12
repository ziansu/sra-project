@java.lang.Override
public bcccp.tickets.season.ISeasonTicket findTicketById(java.lang.String ticketId) {
    bcccp.tickets.season.ISeasonTicket ticketFound = null;
    if (currentTickets.containsKey(ticketId)) {
        return ticketFound = currentTickets.get(ticketId);
    }
    return ticketFound;
}