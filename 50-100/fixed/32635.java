protected boolean putServiceFunctionForwarder(org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.sff.rev140701.service.function.forwarders.ServiceFunctionForwarder sff) {
    boolean ret;
    org.opendaylight.sfc.provider.SfcProviderDebug.printTraceStart(org.opendaylight.sfc.provider.api.SfcProviderServiceForwarderAPI.LOG);
    org.opendaylight.yangtools.yang.binding.InstanceIdentifier<org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.sff.rev140701.service.function.forwarders.ServiceFunctionForwarder> sffEntryIID = org.opendaylight.yangtools.yang.binding.InstanceIdentifier.builder(org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.sff.rev140701.ServiceFunctionForwarders.class).child(org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.sff.rev140701.service.function.forwarders.ServiceFunctionForwarder.class, sff.getKey()).build();
    ret = org.opendaylight.sfc.provider.api.SfcDataStoreAPI.writePutTransactionAPI(sffEntryIID, sff, LogicalDatastoreType.CONFIGURATION);
    org.opendaylight.sfc.provider.SfcProviderDebug.printTraceStop(org.opendaylight.sfc.provider.api.SfcProviderServiceForwarderAPI.LOG);
    return ret;
}