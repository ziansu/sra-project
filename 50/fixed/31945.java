@java.lang.Override
public java.lang.String networkInterfaceIpConfigurationId() {
    if ((this.inner().backendIPConfiguration()) == null) {
        return null;
    }else {
        return this.inner().backendIPConfiguration().id();
    }
}