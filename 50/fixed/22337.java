private boolean isVpcOfferingRedundantRouter(final java.util.Map serviceCapabilitystList) {
    return findCapabilityForService(serviceCapabilitystList, Capability.RedundantRouter, Service.SourceNat);
}