public org.opencps.paymentmgt.model.PaymentFile getByTransactionId(long keypayTransactionId) throws com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
    return paymentFilePersistence.fetchByT_I(keypayTransactionId);
}