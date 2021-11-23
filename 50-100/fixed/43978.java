public org.opencps.paymentmgt.model.PaymentFile updatePaymentFile(long paymentFileId, java.lang.String keypayUrl, long keypayTransactionId, java.lang.String keypayGoodCode, java.lang.String keypayMerchantCode) throws com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
    org.opencps.paymentmgt.model.PaymentFile paymentFile = paymentFilePersistence.fetchByPrimaryKey(paymentFileId);
    paymentFile.setKeypayUrl(keypayUrl);
    paymentFile.setKeypayTransactionId(keypayTransactionId);
    paymentFile.setKeypayGoodCode(keypayGoodCode);
    paymentFile.setKeypayMerchantCode(keypayMerchantCode);
    paymentFilePersistence.update(paymentFile);
    return paymentFile;
}