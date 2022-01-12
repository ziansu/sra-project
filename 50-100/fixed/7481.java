private void initializeSubnetsFromInner() {
    this.subnets = new java.util.TreeMap<>();
    if ((this.inner().subnets()) != null) {
        for (com.microsoft.azure.management.network.implementation.SubnetInner subnetInner : this.inner().subnets()) {
            com.microsoft.azure.management.network.implementation.SubnetImpl subnet = new com.microsoft.azure.management.network.implementation.SubnetImpl(subnetInner.name(), subnetInner, this);
            this.subnets.put(subnetInner.name(), subnet);
        }
    }
}