void endTransportMaintenance() {
    if (state.equals(org.wso2.carbon.kernel.transports.CarbonTransport.State.IN_MAINTENANCE)) {
        state = org.wso2.carbon.kernel.transports.CarbonTransport.State.STARTED;
    }else {
        throw new java.lang.IllegalStateException(((("Cannot end maintenance of transport " + (id)) + ". Current state: ") + (state)));
    }
    endMaintenance();
}