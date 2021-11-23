@java.lang.Override
public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method iMethod, java.lang.Object[] args) {
    java.lang.String sKey = getSKey(iClass, iMethod);
    com.ikamobile.ikasoa.DefaultIkasoaFactory.LOG.debug(("server key : " + sKey));
    com.ikamobile.ikasoa.BaseGetService<java.lang.Object[], T> s = bgsFactory.getBaseGetService(serverHost, serverPort, sKey, new com.ikamobile.ikasoa.handler.ReturnData(iMethod));
    try {
        return s.get(args);
    } catch (java.lang.Throwable e) {
        com.ikamobile.ikasoa.DefaultIkasoaFactory.LOG.error(e.getMessage(), e);
        return null;
    }
}