@java.lang.Override
public java.util.Collection<org.mifosplatform.portfolio.accountdetails.PaymentDetailCollectionData> retrivePaymentDetail(java.lang.Long clientId) {
    this.clientReadPlatformService.retrieveOne(clientId);
    return retrievePaymentDetails(new java.lang.Object[]{ clientId , clientId , clientId });
}