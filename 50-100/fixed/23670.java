public boolean saveEventToUser(eventspider.database.User user, eventspider.database.EventBean event) {
    try {
        session.beginTransaction();
        user.getEvents().add(event);
        session.getTransaction().commit();
    } catch (java.lang.Exception e) {
        log.error(e);
        return false;
    }
    return true;
}