public java.util.Map<java.lang.String, java.lang.Object> getDeviceParameters() {
    java.util.Map<java.lang.String, java.lang.Object> paramaters = new java.util.HashMap<>();
    paramaters.put(com.ronnie.athena.models.Device.Name, getName());
    paramaters.put(com.ronnie.athena.models.Device.State, getState());
    paramaters.put(com.ronnie.athena.models.Device.Manager, getManager());
    paramaters.put(com.ronnie.athena.models.Device.PhoneNumber, getPhoneNumber());
    paramaters.put(com.ronnie.athena.models.Device.Team, getTeam());
    paramaters.put(com.ronnie.athena.models.Device.Region, getRegion());
    return paramaters;
}