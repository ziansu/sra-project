public static org.eclipse.ecf.mgmt.identity.NamespaceMTO createNamespaceMTO(org.eclipse.ecf.core.identity.Namespace ns) {
    return new org.eclipse.ecf.mgmt.identity.NamespaceMTO(ns.getName(), ns.getDescription(), ns.getScheme(), ns.getSupportedSchemes(), org.eclipse.ecf.mgmt.identity.host.IdentityFactoryManager.convertClassArrayToNameArray(ns.getSupportedParameterTypes()));
}