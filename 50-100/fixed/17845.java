private java.lang.String getStreetName_Ternary(org.codefx.lab.elvis.ElvisDemo.Order order) {
    org.codefx.lab.elvis.ElvisDemo.Customer customer = (order == null) ? null : order.getCustomer();
    org.codefx.lab.elvis.ElvisDemo.Address address = (customer == null) ? null : customer.getAddress();
    return address == null ? null : address.getStreetName();
}