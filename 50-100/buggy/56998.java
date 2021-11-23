public model.Address createAddress(java.lang.Long id, java.lang.String street, java.lang.String city, java.lang.String state, java.lang.String zipcode, java.lang.String country) {
    model.Customer customer = this.em.find(model.Customer.class, id);
    model.Address address = new model.Address(street, city, state, zipcode, country);
    customer.setAddress(address);
    this.em.persist(address);
    return address;
}