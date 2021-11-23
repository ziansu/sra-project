public com.epam.training.webservice.common.domains.Ticket buyTicket(int numberTicket) throws com.epam.training.webservice.common.exceptions.BookingException {
    com.epam.training.webservice.common.domains.Ticket ticketInSystem = processedTickets.get(numberTicket);
    if (ticketInSystem != null) {
        if ((ticketInSystem.getState()) == (com.epam.training.webservice.common.domains.StateTicket.BOOKED)) {
            ticketInSystem.setState(StateTicket.PAID);
            return ticketInSystem;
        }
        throw new com.epam.training.webservice.common.exceptions.BookingException((("State ticket " + (ticketInSystem.getState())) + " incorret!"));
    }
    throw new com.epam.training.webservice.common.exceptions.BookingException((("Number ticket " + numberTicket) + " incorret!"));
}