@java.lang.Override
public org.broadleafcommerce.core.web.checkout.model.BillingInfoForm prePopulateBillingInfoForm(org.broadleafcommerce.core.web.checkout.model.BillingInfoForm billingInfoForm, org.broadleafcommerce.core.web.checkout.model.ShippingInfoForm shippingInfoForm, org.broadleafcommerce.core.order.domain.Order cart) {
    org.broadleafcommerce.profile.core.domain.Address orderPaymentBillingAddress = getAddressFromCCOrderPayment(cart);
    billingInfoForm.setAddress(orderPaymentBillingAddress);
    boolean shippingAddressUsedForBilling = addressesContentsAreEqual(shippingInfoForm.getAddress(), billingInfoForm.getAddress());
    billingInfoForm.setUseShippingAddress(shippingAddressUsedForBilling);
    return billingInfoForm;
}