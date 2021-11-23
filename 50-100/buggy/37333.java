public java.lang.Boolean doCheckForPossibilityToCloseTicket(k7i3.code.helpdesk.tnc.Ticket ticket) {
    logger.info("=>=>=>=>=> TicketController.doCheckForPossibilityToCloseTicket()");
    ticket = ticketEJB.findTicketById(ticket.getId());
    return ((((ticket.getClosing()) == null) && ((ticket.getAcceptance()) != null)) && ((ticket.getIncorrectness()) == null)) && ((ticket.getCancellation()) == null);
}