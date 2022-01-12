public java.lang.Boolean subscribeDoorOpensNextTime(de.fau.cs.mad.fablab.rest.core.PushToken token) {
    org.hibernate.Query query = super.currentSession().createQuery("FROM PushToken WHERE token = :token AND triggerPushType = :trigger");
    query.setParameter("token", token.getToken());
    query.setParameter("trigger", token.getTriggerPushType());
    if ((query.list().size()) == 0) {
        token.setTriggerPushType(TriggerPushType.DOOR_OPENS_NEXT_TIME);
        persist(token);
    }
    return true;
}