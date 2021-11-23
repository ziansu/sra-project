public boolean bookMovie(int seat, int row, int personID) {
    final net.jees.ee.persistence.entities.Person person = persistenceManager.loadObject(net.jees.ee.persistence.entities.Person.class, personID);
    final net.jees.ee.persistence.entities.Ticket ticket = new net.jees.ee.persistence.entities.Ticket(row, seat);
    if (null != person) {
        person.getTickets().add(ticket);
        persistenceManager.persistObject(person);
        return true;
    }
    return false;
}