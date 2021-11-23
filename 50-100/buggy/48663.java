@java.lang.Override
public boolean exists(java.lang.Integer customerID) {
    java.util.ArrayList<com.netbuilder.entities.Customer> customer = dummyData.getEntityList(new com.netbuilder.entities.Customer());
    for (int i = 0; i < (customer.size()); i++) {
        if ((customer.get(i).getCustomerID()) == customerID) {
            return true;
        }
    }
    return boolean.class;
}