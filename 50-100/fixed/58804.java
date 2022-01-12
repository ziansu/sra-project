private void clearStoredOrder() {
    com.getataxi.mobiletaxi.utils.UserPreferencesManager.clearOrderAssignment(context);
    hasAssignedOrder = false;
    assignedOrderId = -1;
    clientUpdatedLocation = null;
    clientLocation = null;
    if ((clientLocationMarker) != null) {
        clientLocationMarker.remove();
        clientLocationMarker = null;
    }
    if ((destinationLocationMarker) != null) {
        destinationLocationMarker.remove();
        destinationLocationMarker = null;
    }
    clientOrderDM = null;
    stopTrackingService();
}