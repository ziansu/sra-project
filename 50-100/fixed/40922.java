public java.util.Map<java.lang.String, java.lang.Object> getDeviceParameters() {
    java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>();
    parameters.put(com.ronnie.athena.models.Device.Name, getName());
    parameters.put(com.ronnie.athena.models.Device.State, getState());
    parameters.put(com.ronnie.athena.models.Device.Manager, getManager());
    parameters.put(com.ronnie.athena.models.Device.PhoneNumber, getPhoneNumber());
    parameters.put(com.ronnie.athena.models.Device.Team, getTeam());
    parameters.put(com.ronnie.athena.models.Device.Region, getRegion());
    return parameters;
}