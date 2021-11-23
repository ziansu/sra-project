@java.lang.Override
protected void remove(org.opendaylight.yangtools.yang.binding.InstanceIdentifier<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.interfaces.rev140508.interfaces.Interface> key, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.interfaces.rev140508.interfaces.Interface port) {
    java.lang.String interfaceId = port.getName();
    org.opendaylight.netvirt.aclservice.api.utils.AclInterface aclInterface = org.opendaylight.netvirt.aclservice.api.utils.AclInterfaceCacheUtil.getAclInterfaceFromCache(interfaceId);
    if (org.opendaylight.netvirt.aclservice.utils.AclServiceUtils.isOfInterest(aclInterface)) {
        org.opendaylight.netvirt.aclservice.api.utils.AclInterfaceCacheUtil.removeAclInterfaceFromCache(interfaceId);
        if (aclClusterUtil.isEntityOwner()) {
            org.opendaylight.netvirt.aclservice.listeners.AclInterfaceListener.LOG.debug("On remove event, notify ACL service manager to unbind ACL from interface: {}", port);
            aclServiceManager.notify(aclInterface, null, Action.UNBIND);
        }
    }
}