@java.lang.Override
public java.io.Serializable create(org.apache.shiro.session.Session session) {
    com.parallax.server.blocklyprop.security.BlocklyPropSessionDao.LOG.info("Create BlocklyProp session");
    session.setTimeout(3600000);
    org.apache.shiro.session.mgt.SimpleSession simpleSession = ((org.apache.shiro.session.mgt.SimpleSession) (session));
    java.lang.String uuid = java.util.UUID.randomUUID().toString();
    simpleSession.setId(uuid);
    com.parallax.server.blocklyprop.services.impl.SessionServiceImpl.getSessionService().create(convert(simpleSession));
    com.parallax.server.blocklyprop.security.BlocklyPropSessionDao.LOG.info("Session timeout is: {}", session.getTimeout());
    com.parallax.server.blocklyprop.security.BlocklyPropSessionDao.LOG.info("Creating session: {}", simpleSession.getId());
    return uuid;
}