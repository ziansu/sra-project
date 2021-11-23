@java.lang.Override
public boolean save(ua.kobzev.theatre.repository.impl.mysql.Ticket ticket) {
    if (isPurchased(ticket.getAssignedEvent(), ticket.getSeat()))
        return false;
    
    int result = jdbcOperations.update(ua.kobzev.theatre.repository.impl.mysql.TicketRepositoryImpl.SQLSAVE, ticket.getUser().getId(), ticket.getAssignedEvent().getId(), ticket.getSeat(), ticket.getPrice());
    return result == 0 ? false : true;
}