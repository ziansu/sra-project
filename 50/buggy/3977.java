public org.opencps.paymentmgt.model.PaymentFile getPaymentFileByMerchantResponse(java.lang.String keypayTransactionId, java.lang.String keypayGoodCode, double amount) throws com.liferay.portal.kernel.exception.SystemException {
    return paymentFilePersistence.fetchByMerchantResponse(keypayTransactionId, keypayGoodCode, amount);
}