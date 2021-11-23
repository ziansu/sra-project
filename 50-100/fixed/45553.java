@java.lang.Override
protected java.util.Map<java.lang.String, java.lang.String> getConnectorSpecificLaunchParams(com.sixsq.slipstream.persistence.Run run, com.sixsq.slipstream.persistence.User user) throws com.sixsq.slipstream.exceptions.ConfigurationException, com.sixsq.slipstream.exceptions.ValidationException {
    java.util.Map<java.lang.String, java.lang.String> launchParams = new java.util.HashMap<java.lang.String, java.lang.String>();
    launchParams.putAll(getInstanceSizeParams(run));
    launchParams.put("network-public", getNetworkPublic());
    launchParams.put("network-private", getNetworkPrivate());
    launchParams.put("custom-vm-template", getCustomVMTemplate(run));
    return launchParams;
}