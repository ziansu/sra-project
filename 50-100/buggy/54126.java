public void createNewCustomer(java.lang.String firstName, java.lang.String lastName, java.lang.String login, java.lang.String password, java.lang.Integer isActive) throws java.security.NoSuchAlgorithmException {
    java.sql.Date createDate = getDate();
    java.sql.Date lastLogin = null;
    java.lang.String hashedPass = controller.CustomerController.HashPassword(password);
    model.Customer customer = new model.Customer(firstName, lastName, login, hashedPass, createDate, isActive, lastLogin);
    customerDaoImpl.addCustomer(customer);
}