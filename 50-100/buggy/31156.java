private org.cdrolet.cdirect.entity.Customer delete(org.cdrolet.cdirect.service.EventDetail event) {
    org.cdrolet.cdirect.entity.Customer customer = repository.findOne(getUserId(event));
    if (customer.getDefaultUser()) {
        throw new org.cdrolet.cdirect.exception.ProcessException("can't unassign the default user", org.cdrolet.cdirect.type.ErrorCode.FORBIDDEN);
    }
    customer.getSubscription().getCustomers().remove(customer);
    customer.setSubscription(null);
    repository.delete(customer);
    return customer;
}