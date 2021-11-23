private com.getataxi.mobiletaxi.comm.models.OrderDetailsDM prepareDriverOrderDetails(com.getataxi.mobiletaxi.comm.models.OrderDetailsDM sourceOrderDM) {
    sourceOrderDM.orderId = -1;
    if ((taxiDriverLocation) != null) {
        sourceOrderDM.orderLatitude = taxiDriverLocation.getLatitude();
        sourceOrderDM.orderLongitude = taxiDriverLocation.getLongitude();
    }
    sourceOrderDM.status = Constants.OrderStatus.InProgress.getValue();
    sourceOrderDM.taxiId = taxi.taxiId;
    sourceOrderDM.taxiPlate = taxi.plate;
    sourceOrderDM.driverPhone = phoneNumber;
    return sourceOrderDM;
}