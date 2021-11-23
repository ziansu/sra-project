public static boolean acknowledgeTransaction(db.DbConnect db, hack.humanAtm.TransactionPOJO transactionPOJO) {
    hack.humanAtm.PaymentSuccessMeta psm = db.processTransactionSuccess(transactionPOJO.getTransactionId());
    try {
        hack.humanAtm.Utils.sendSuccessNotifications(psm.getGcmId(), psm.getAmount());
    } catch (java.io.IOException e) {
        log.error("Can't send gcm msg", e);
        return false;
    }
    return true;
}