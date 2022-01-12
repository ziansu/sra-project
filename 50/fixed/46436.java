@java.lang.Override
public boolean isSeasonTicketInUse(java.lang.String ticketId) {
    return seasonTicketDAO.findTicketById(ticketId).inUse();
}