public com.bae.oc.entities.Customer register(java.lang.String iFirstName, java.lang.String iLastName, java.lang.String iEmail, java.lang.String iPassword, java.lang.String iLine1, java.lang.String iLine2, java.lang.String iPostcode, java.lang.String iCity) {
    com.bae.oc.entities.Customer customer = customerManager.createNewCustomer(new com.bae.oc.entities.Customer(iFirstName, iLastName, iEmail, iPassword, new com.bae.oc.entities.Address(iLine1, iLine2, iPostcode, iCity), getCurrentDate()));
    return customer;
}