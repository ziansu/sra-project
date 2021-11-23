@java.lang.Override
public boolean isSeasonTicketInUse(java.lang.String ticketId) {
    bcccp.tickets.season.ISeasonTicket ticket = seasonTicketDAO.findTicketById(ticketId);
    if (ticket == null)
        throw new java.lang.RuntimeException(("recordSeasonTicketExit: invalid ticketId - " + ticketId));
    
    return ticket.inUse();
}