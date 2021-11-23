@java.lang.Override
public bcccp.tickets.adhoc.IAdhocTicket findTicketByBarcode(java.lang.String findBarcode) {
    for (int i = 0; i < (currentAdhocTickets.size()); i++) {
        if ((currentAdhocTickets.get(i).getBarcode()) == null ? findBarcode == null : currentAdhocTickets.get(i).getBarcode().equals(findBarcode)) {
            return currentAdhocTickets.get(i);
        }
    }
    return null;
}