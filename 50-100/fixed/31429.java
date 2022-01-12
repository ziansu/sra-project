private boolean isAvailable(de.rwth.idsg.bikeman.ixsi.service.Pedelec pedelec) {
    final double lowerLimit = 0.0;
    return ((OperationState.OPERATIVE.equals(pedelec.getState())) && (!(pedelec.getInTransaction()))) && ((pedelec.getChargingStatus().getBatteryStateOfCharge()) > lowerLimit);
}