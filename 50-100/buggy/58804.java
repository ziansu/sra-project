private void clearStoredOrder() {
    com.getataxi.mobiletaxi.utils.UserPreferencesManager.clearOrderAssignment(context);
    hasAssignedOrder = false;
    assignedOrderId = -1;
    clientUpdatedLocation = null;
    clientLocation = null;
    if ((clientLocationMarker) != null) {
        clientLocationMarker.remove();
    }
    if ((destinationLocationMarker) != null) {
        destinationLocationMarker.remove();
    }
    clientOrderDM = null;
    stopTrackingService();
}