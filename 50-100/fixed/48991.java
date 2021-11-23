@java.lang.Override
public void run() {
    try {
        serverChannelInit.set(true);
        org.opendaylight.sxp.core.service.ConnectFacade.createServer(node, getServerPort(), handlerFactoryServer);
    } catch (java.lang.Exception e) {
        org.opendaylight.sxp.core.SxpNode.LOG.warn((node + " {}"), e.getMessage());
    }
}