@java.lang.Override
public void sessionDestroyed(javax.servlet.http.HttpSessionEvent se) {
    java.lang.Integer idUser = ((java.lang.Integer) (se.getSession().getAttribute(ParamDefine.USER)));
    if (idUser != null) {
        AuthenAppsFilter._clientMap.remove(idUser);
        InBoundClient._clientSessionMap.remove(idUser);
    }
}