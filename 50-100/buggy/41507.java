private void commitUpdate(SharedClasses.TransportsEmployess.Transport transport) {
    if (bl.updateTransport(transport.getDateOfDep(), transport.getHourOfDep(), transport.getTruckNo(), transport.getDriverID(), transport.getCompanyID(), transport.getCurrentWeight(), transport.getSourceDoc(), transport.getAddressOrign()))
        java.lang.System.out.println("Transport updated successfully.");
    else
        java.lang.System.out.println("Unfortunately the system couldnt update the transport in the data base.");
    
}