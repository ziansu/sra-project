private boolean isAvailable(de.rwth.idsg.bikeman.ixsi.service.Pedelec pedelec) {
    final float lowerLimit = 0.0F;
    return ((OperationState.OPERATIVE.equals(pedelec.getState())) && (!(pedelec.getInTransaction()))) && ((pedelec.getChargingStatus().getBatteryStateOfCharge()) > lowerLimit);
}