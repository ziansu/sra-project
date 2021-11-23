public void delete(org.hibernate.Session session, ru.atom.dbhackaton.resource.Token token) {
    session.saveOrUpdate(token.setUser(null));
    session.delete(token);
}