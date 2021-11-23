@java.lang.Override
protected void validateRequest() {
    net.authorize.api.contract.v1.ValidateCustomerPaymentProfileRequest request = this.getApiRequest();
    if (null == (request.getCustomerProfileId()))
        throw new java.lang.NullPointerException("CustomerProfileId cannot be null");
    
    if (null == (request.getCustomerPaymentProfileId()))
        throw new java.lang.NullPointerException("CustomerPaymentProfileId cannot be null");
    
}