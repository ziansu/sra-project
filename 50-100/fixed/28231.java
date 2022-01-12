@java.lang.Override
public void requestDestroyed(javax.servlet.ServletRequestEvent requestEvent) {
    org.hibernate.Session session = ((org.hibernate.Session) (requestEvent.getServletRequest().getAttribute(ParamDefine.HIBERNATE_SESSION)));
    if (session != null) {
        try {
            logia.hibernate.util.HibernateUtil.closeSession(session);
            requestEvent.getServletRequest().removeAttribute(ParamDefine.HIBERNATE_SESSION);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}