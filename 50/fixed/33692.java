public pl.mwezyk.parking.model.SingleCarStop stopParking(java.lang.String carPlateNumber, long id) {
    pl.mwezyk.parking.model.SingleCarStop singleCarStop = carStopDAO.stopParkingTimer(carPlateNumber, id);
    singleCarStop.setSingleStopPrice(amountCounter.countAmountForParking(singleCarStop));
    singleCarStop.setStarted(false);
    return singleCarStop;
}