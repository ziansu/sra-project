public long startParking(java.lang.String carPlateNumber, java.lang.String carType) {
    pl.mwezyk.parking.model.SingleCarStop singleCarStop = new pl.mwezyk.parking.model.SingleCarStop();
    singleCarStop.setCarPlate(carPlateNumber);
    singleCarStop.setCarType(carType);
    singleCarStop.setStarted(true);
    return carStopDAO.startParkingTimer(singleCarStop);
}