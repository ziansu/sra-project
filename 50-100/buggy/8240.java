private com.my.hps.webapp.model.HpsHeatingMaintainPaymentDate2015 getPaymentDateOfHouse(com.my.hps.webapp.model.HpsHouse house) {
    java.lang.String baseCode = house.getBaseCode();
    java.util.List<com.my.hps.webapp.model.HpsHeatingMaintainPaymentDate2015> paymentDates = getPaymentDates();
    for (com.my.hps.webapp.model.HpsHeatingMaintainPaymentDate2015 paymentDate : paymentDates) {
        if (paymentDate.getBase().getCode().equals(baseCode)) {
            return paymentDate;
        }
    }
    throw new com.my.hps.webapp.exception.PaymentDateNotExistsException();
}