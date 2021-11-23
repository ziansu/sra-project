public com.kk.ticket.model.VenueLevel getVenueList(int levelID) {
    com.kk.ticket.model.VenueLevel resp = new com.kk.ticket.model.VenueLevel();
    org.hibernate.Session session = com.kk.ticket.service.TicketServiceImpl.factory.openSession();
    org.hibernate.Criteria c = session.createCriteria(com.kk.ticket.model.VenueLevel.class);
    c.add(org.hibernate.criterion.Restrictions.like("levelID", levelID));
    @java.lang.SuppressWarnings(value = "unchecked")
    final java.util.List<com.kk.ticket.model.VenueLevel> slist = c.list();
    for (final com.kk.ticket.model.VenueLevel b : slist) {
        resp = b;
    }
    return resp;
}