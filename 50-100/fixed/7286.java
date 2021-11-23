@java.lang.Override
public void onEndpointPoolConfigurationSet(org.openhab.io.transport.modbus.endpoint.ModbusSlaveEndpoint endpoint, org.openhab.io.transport.modbus.endpoint.EndpointPoolConfiguration otherConfig) {
    synchronized(this) {
        if ((((this.configuration) != null) && (endpoint.equals(this.endpoint))) && (!(this.configuration.equals(otherConfig)))) {
            updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.CONFIGURATION_ERROR, java.lang.String.format("Endpoint '%s' has conflicting parameters: parameters of this thing (%s) {} are different from {}", endpoint, this.thing, this.configuration, otherConfig));
        }
    }
}