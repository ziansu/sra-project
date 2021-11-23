@java.lang.Override
public void registerMethods(org.openbase.jul.extension.rsb.iface.RSBLocalServer server) throws org.openbase.jul.exception.CouldNotPerformException {
    org.openbase.jul.extension.rsb.com.RPCHelper.registerInterface(org.openbase.bco.dal.lib.layer.unit.connection.Connection.class, this, server);
}