@java.lang.Override
public synchronized org.mcrest.application.Restlet createInboundRoot() {
    authpara = org.mcrest.ConfigHandler.getInstance().getAuthPara();
    org.restlet.routing.Router router = new org.restlet.routing.Router(getContext());
    setUpRouter(router);
    return router;
}