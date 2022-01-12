public java.lang.Boolean unsubscribeDoorOpensNextTime(de.fau.cs.mad.fablab.rest.core.PushToken token) {
    java.lang.System.out.println(("DELETEING: " + token));
    org.hibernate.Query query = super.currentSession().createQuery("DELETE PushToken WHERE token = :token AND triggerPushType = :trigger");
    query.setParameter("token", token.getToken());
    query.setParameter("trigger", token.getTriggerPushType());
    query.executeUpdate();
    return doorOpensNextTimeIsSetForToken(token);
}