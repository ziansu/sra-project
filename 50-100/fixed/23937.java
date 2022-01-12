@java.lang.Override
protected org.opendaylight.neutron.spi.INeutronL2gatewayConnectionCRUD getNeutronCRUD() {
    org.opendaylight.neutron.spi.NeutronCRUDInterfaces answer = new org.opendaylight.neutron.spi.NeutronCRUDInterfaces().fetchINeutronL2gatewayConnectionCRUD(this);
    if ((answer.getL2gatewayConnectionInterface()) == null) {
        throw new org.opendaylight.neutron.northbound.api.ServiceUnavailableException(serviceUnavailable());
    }
    return answer.getL2gatewayConnectionInterface();
}