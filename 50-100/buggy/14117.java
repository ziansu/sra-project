private com.getataxi.mobiletaxi.comm.models.OrderDetailsDM prepareOrderDetails(com.getataxi.mobiletaxi.comm.models.OrderDetailsDM sourceOrderDM) {
    sourceOrderDM.orderId = -1;
    if ((((taxiDriverLocation) != null) && ((sourceOrderDM.orderAddress) != null)) && (sourceOrderDM.orderAddress.isEmpty())) {
        sourceOrderDM.orderLatitude = taxiDriverLocation.getLatitude();
        sourceOrderDM.orderLongitude = taxiDriverLocation.getLongitude();
    }
    sourceOrderDM.isWaiting = false;
    sourceOrderDM.isFinished = false;
    sourceOrderDM.taxiId = taxi.taxiId;
    sourceOrderDM.taxiPlate = taxi.plate;
    sourceOrderDM.driverPhone = phoneNumber;
    return sourceOrderDM;
}