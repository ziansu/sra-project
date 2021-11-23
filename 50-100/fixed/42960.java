private boolean isRegisteredPersonRequireNotification(final org.yes.cart.domain.entity.RegisteredPerson registeredPerson, final org.yes.cart.domain.entity.Shop shop) {
    if (registeredPerson instanceof org.yes.cart.domain.entity.Customer) {
        final org.yes.cart.domain.entity.Customer customer = ((org.yes.cart.domain.entity.Customer) (registeredPerson));
        if (org.apache.commons.lang.StringUtils.isNotBlank(customer.getCustomerType())) {
            return shop.isSfRequireCustomerRegistrationNotification(customer.getCustomerType());
        }
    }
    return false;
}