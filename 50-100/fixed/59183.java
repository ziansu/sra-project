@java.lang.Override
public void delete(java.lang.String id) {
    org.openbaton.catalogue.mano.descriptor.VirtualNetworkFunctionDescriptor virtualNetworkFunctionDescriptor = vnfdRepository.findFirstById(id);
    log.info(("Removing VNFD: " + (virtualNetworkFunctionDescriptor.getName())));
    vnfdRepository.delete(virtualNetworkFunctionDescriptor);
    log.info(("Removing vnfPackage with id: " + (virtualNetworkFunctionDescriptor.getVnfPackageLocation())));
    vnfPackageRepository.delete(virtualNetworkFunctionDescriptor.getVnfPackageLocation());
}