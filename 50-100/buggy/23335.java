@java.lang.Override
public com.nvisia.examples.camel.customer.Customer getCustomer(int id) {
    if (id == 1) {
        return new com.nvisia.examples.camel.customer.Customer(1, "Han", "Solo", "888-888-8888");
    }else
        if (id == 2) {
            return new com.nvisia.examples.camel.customer.Customer(1, "Ben", "Solo", "444-333-8228");
        }else {
            return null;
        }
    
}