public java.lang.Boolean doorOpensNextTimeIsSetForToken(de.fau.cs.mad.fablab.rest.core.PushToken token) {
    org.hibernate.Query query = super.currentSession().createQuery("FROM PushToken WHERE token = :token AND triggerPushType = :trigger");
    query.setParameter("token", token.getToken());
    query.setParameter("trigger", TriggerPushType.DOOR_OPENS_NEXT_TIME);
    if ((query.list().size()) == 0)
        return false;
    
    return true;
}