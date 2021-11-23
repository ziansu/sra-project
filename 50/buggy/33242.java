@java.lang.Override
public ticket_system.server.system.transaction.ReservationTransaction reserveTickets(long eventId, int numGuestTickets) throws java.rmi.RemoteException {
    ticket_system.server.system.transaction.ReservationTransaction trans = system.getEvent(eventId).reserveTickets(numGuestTickets);
    cart.add(new ticket_system.client.features.CartItem(trans));
    return trans;
}