public java.lang.String login(com.realdolmen.VO.CustomerLoginVO customervo) {
    com.realdolmen.domain.Customer customer;
    customer = repo.getCustomerByEmail(customervo.getEmail());
    if (org.mindrot.jbcrypt.BCrypt.checkpw(customervo.getPassword(), customer.getPassword())) {
        return CreateJwt(customer);
    }
    return null;
}