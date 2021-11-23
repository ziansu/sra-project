void startTransport() {
    if (((state.equals(org.wso2.carbon.kernel.transports.CarbonTransport.State.UNINITIALIZED)) || (state.equals(org.wso2.carbon.kernel.transports.CarbonTransport.State.IN_MAINTENANCE))) || (state.equals(org.wso2.carbon.kernel.transports.CarbonTransport.State.STOPPED))) {
        start();
        state = org.wso2.carbon.kernel.transports.CarbonTransport.State.STARTED;
    }else {
        throw new java.lang.IllegalStateException(((("Cannot start transport " + (id)) + ". Current state: ") + (state)));
    }
}