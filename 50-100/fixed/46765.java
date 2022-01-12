public java.lang.Boolean doCheckForPossibilityToCancelTicket(k7i3.code.helpdesk.tnc.Ticket ticket) {
    logger.info("=>=>=>=>=> TicketController.doCheckForPossibilityToCancelTicket()");
    ticket = ticketEJB.findTicketById(ticket.getId());
    this.ticket = ticket;
    return (((ticket.getArchiving()) == null) && ((ticket.getIncorrectness()) == null)) && ((ticket.getCancellation()) == null);
}