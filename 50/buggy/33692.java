public pl.mwezyk.parking.model.SingleCarStop stopParking(java.lang.String carPlateNumber) {
    pl.mwezyk.parking.model.SingleCarStop singleCarStop = carStopDAO.stopParkingTimer(carPlateNumber);
    singleCarStop.setSingleStopPrice(amountCounter.countAmountForParking(singleCarStop));
    singleCarStop.setStarted(false);
    return singleCarStop;
}