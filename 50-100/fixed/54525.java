private void handleReceivePacket(com.jaguarlandrover.rvi.DlinkReceivePacket packet) {
    com.jaguarlandrover.rvi.Service service = packet.getService();
    if (!(mAuthorizedLocalServices.containsKey(service.getServiceIdentifier()))) {
        return ;
    }
    if (!(mAuthorizedLocalServices.get(service.getServiceIdentifier()).getFullyQualifiedServiceIdentifier().equals(service.getFullyQualifiedServiceIdentifier()))) {
        return ;
    }
    if ((mListener) != null)
        mListener.nodeReceiveServiceInvocationSucceeded(this, service.getServiceIdentifier(), service.getParameters());
    
}