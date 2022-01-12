@java.lang.Override
public bcccp.tickets.season.ISeasonTicket findTicketById(java.lang.String ticketId) {
    java.util.Iterator<bcccp.tickets.season.ISeasonTicket> sTicketRecs = seasonTickets.iterator();
    bcccp.tickets.season.ISeasonTicket sTicket = null;
    while (sTicketRecs.hasNext()) {
        sTicket = sTicketRecs.next();
        if (sTicket.getId().contentEquals(ticketId)) {
            break;
        }else {
            sTicket = null;
        }
    } 
    return sTicket;
}