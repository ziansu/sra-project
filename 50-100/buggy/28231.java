@java.lang.Override
public void requestDestroyed(javax.servlet.ServletRequestEvent requestEvent) {
    try {
        org.hibernate.Session session = ((org.hibernate.Session) (requestEvent.getServletRequest().getAttribute(ParamDefine.HIBERNATE_SESSION)));
        logia.hibernate.util.HibernateUtil.closeSession(session);
        requestEvent.getServletRequest().removeAttribute(ParamDefine.HIBERNATE_SESSION);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}