protected com.microsoft.azure.SubResource ensureFrontendRef(java.lang.String name) {
    com.microsoft.azure.management.network.implementation.LoadBalancerFrontendImpl frontend;
    if (name == null) {
        frontend = this.ensureDefaultFrontend();
    }else {
        frontend = this.defineFrontend(name);
        frontend.attach();
    }
    return new com.microsoft.azure.SubResource().withId((((this.futureResourceId()) + "/frontendIPConfigurations/") + name));
}