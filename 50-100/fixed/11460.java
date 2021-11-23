private org.openbaton.nfvo.core.api.VNFCInstance getVNFCI(org.openbaton.nfvo.core.api.VirtualDeploymentUnit virtualDeploymentUnit, java.lang.String idVNFCI) throws org.openbaton.nfvo.core.api.NotFoundException {
    for (org.openbaton.nfvo.core.api.VNFCInstance vnfcInstance : virtualDeploymentUnit.getVnfc_instance())
        if ((idVNFCI == null) || (idVNFCI.equals(vnfcInstance.getId())))
            return vnfcInstance;
        
    
    throw new org.openbaton.nfvo.core.api.NotFoundException((("VNFCInstance with id " + idVNFCI) + " was not found"));
}