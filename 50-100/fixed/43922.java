protected edu.uiuc.ncsa.myproxy.MyProxyConnectable createMPConnection(edu.uiuc.ncsa.security.core.Identifier identifier, java.lang.String userName, java.lang.String password, long lifetime, java.lang.String loa) throws java.security.GeneralSecurityException {
    edu.uiuc.ncsa.myproxy.MPConnectionProvider facades = new edu.uiuc.ncsa.myproxy.MPConnectionProvider(getMyLogger(), edu.uiuc.ncsa.myproxy.oa4mp.server.servlet.MyProxyDelegationServlet.getServiceEnvironment().getMyProxyServices());
    edu.uiuc.ncsa.myproxy.MyProxyConnectable mpc = facades.findConnection(identifier, userName, password, loa, lifetime);
    edu.uiuc.ncsa.security.core.util.DebugUtil.dbg(this, mpc.toString());
    getMyproxyConnectionCache().add(mpc);
    return mpc;
}