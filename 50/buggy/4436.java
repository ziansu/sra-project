@org.junit.Test
public void testHundredCustomers() {
    for (int i = 0; i < 100; i++) {
        hierarchicalInfileObjectLoader.persist(com.opower.persistence.jpile.sample.ObjectFactory.newCustomer());
    }
}