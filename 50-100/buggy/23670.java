public boolean saveEventToUser(eventspider.database.User user, eventspider.database.EventBean event) {
    try {
        session.merge(user);
        session.merge(event);
        session.beginTransaction();
        user.getEvents().add(event);
        session.save(user);
        session.getTransaction().commit();
    } catch (java.lang.Exception e) {
        log.error(e);
        return false;
    }
    return true;
}