@java.lang.Override
public bcccp.tickets.season.ISeasonTicket findTicketById(java.lang.String ticketId) {
    java.util.Iterator<bcccp.tickets.season.ISeasonTicket> sTicketRecs = seasonTickets.iterator();
    while (sTicketRecs.hasNext()) {
        bcccp.tickets.season.ISeasonTicket sTicket = sTicketRecs.next();
        if (ticketId.contentEquals(sTicket.getId())) {
            return sTicket;
        }
    } 
    return null;
}