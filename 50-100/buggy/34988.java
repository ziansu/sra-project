private com.getataxi.mobiletaxi.comm.models.OrderDetailsDM completeOrderDetails(com.getataxi.mobiletaxi.comm.models.OrderDetailsDM sourceOrderDM) {
    sourceOrderDM.orderId = assignedOrderId;
    if (((sourceOrderDM.destinationAddress) != null) && (sourceOrderDM.destinationAddress.isEmpty())) {
        sourceOrderDM.destinationLatitude = taxiDriverLocation.getLatitude();
        sourceOrderDM.destinationLongitude = taxiDriverLocation.getLongitude();
    }
    sourceOrderDM.isWaiting = false;
    sourceOrderDM.isFinished = true;
    com.getataxi.mobiletaxi.comm.models.TaxiDetailsDM taxi = com.getataxi.mobiletaxi.utils.UserPreferencesManager.getAssignedTaxi(context);
    sourceOrderDM.taxiId = taxi.taxiId;
    sourceOrderDM.taxiPlate = taxi.plate;
    sourceOrderDM.driverPhone = phoneNumber;
    return sourceOrderDM;
}