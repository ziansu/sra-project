public com.floreantpos.model.Ticket getFirstSelectedTicket() {
    java.util.List<com.floreantpos.model.Ticket> selectedTickets = myTicketList.getSelectedTickets();
    if (((selectedTickets.size()) == 0) || ((selectedTickets.size()) > 1)) {
        com.floreantpos.ui.dialog.POSMessageDialog.showMessage(this, "Please select a ticket");
        return null;
    }
    com.floreantpos.model.Ticket ticket = selectedTickets.get(0);
    return ticket;
}