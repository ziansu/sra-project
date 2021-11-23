@java.lang.Override
public void deregisterSeasonTicket(bcccp.tickets.season.ISeasonTicket seasonTicket) {
    this.seasonTicketDAO.deregisterTicket(seasonTicket);
}