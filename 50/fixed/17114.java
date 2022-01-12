@java.lang.Override
public boolean isSeasonTicketValid(java.lang.String barcode) {
    bcccp.tickets.season.ISeasonTicket ticket = seasonTicketDAO.findTicketById(barcode);
    return ticket != null;
}