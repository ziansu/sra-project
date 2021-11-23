private com.noname.digital.model.Customer getCustomer(java.lang.Long id) {
    com.noname.digital.model.Customer customer = this.customerRepository.findOne(id);
    return customer;
}