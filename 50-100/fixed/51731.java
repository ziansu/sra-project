private java.util.List<com.emc.storageos.db.client.model.StoragePort> getPortsWithSwitchAffinity(java.net.URI netURI, com.emc.storageos.db.client.model.Initiator initiator, java.lang.String switchName, java.util.Map<java.net.URI, java.util.Map<java.lang.String, java.util.List<com.emc.storageos.db.client.model.StoragePort>>> switchToStoragePortsByNet) {
    java.util.List<com.emc.storageos.db.client.model.StoragePort> portsWithAffinity = new java.util.ArrayList<com.emc.storageos.db.client.model.StoragePort>();
    java.util.Map<java.lang.String, java.util.List<com.emc.storageos.db.client.model.StoragePort>> switchPorts = switchToStoragePortsByNet.get(netURI);
    if ((switchPorts != null) && (switchPorts.containsKey(switchName))) {
        portsWithAffinity.addAll(switchPorts.get(switchName));
    }
    return portsWithAffinity;
}