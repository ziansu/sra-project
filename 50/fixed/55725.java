public pl.mwezyk.parking.model.SingleCarStop checkCarStop(java.lang.String carPlateNumber, long id) {
    pl.mwezyk.parking.model.SingleCarStop singleCarStop = carStopDAO.getSingleCarStop(carPlateNumber, id);
    java.lang.System.out.println(singleCarStop);
    return singleCarStop;
}