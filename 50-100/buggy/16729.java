public static org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.acl.rev140520.access.lists.AccessList getServiceFunctionAcl(java.lang.String sfPathName) {
    org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.sfp.rev140701.service.function.paths.ServiceFunctionPath serviceFunctionPath = org.opendaylight.sfc.provider.api.SfcProviderServicePathAPI.readServiceFunctionPath(sfPathName);
    java.lang.String classifierName = serviceFunctionPath.getClassifier();
    org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.scf.rev140701.service.function.classifiers.ServiceFunctionClassifier classifier = org.opendaylight.sfc.provider.api.SfcProviderServiceClassifierAPI.readServiceClassifierExecutor(classifierName);
    java.lang.String aclName = classifier.getAccessList();
    org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.acl.rev140520.access.lists.AccessList acl = org.opendaylight.sfc.provider.api.SfcProviderAclAPI.readAccessListExecutor(aclName);
    return acl;
}