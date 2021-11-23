public void delete(org.hibernate.Session session, ru.atom.dbhackaton.resource.Token token) {
    session.delete(token);
}