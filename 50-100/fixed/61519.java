@org.junit.Test
public void testEventCallback() {
    com.opower.persistence.jpile.loader.HierarchicalInfileObjectLoader.CallBack callBack = org.mockito.Mockito.mock(HierarchicalInfileObjectLoader.CallBack.class);
    this.hierarchicalInfileObjectLoader.setEventCallback(callBack);
    com.opower.persistence.jpile.sample.Customer customer = com.opower.persistence.jpile.sample.ObjectFactory.newCustomer();
    this.hierarchicalInfileObjectLoader.persist(customer);
    org.mockito.Mockito.verify(callBack, org.mockito.Mockito.times(1)).onBeforeSave(customer);
    org.mockito.Mockito.verify(callBack, org.mockito.Mockito.times(1)).onAfterSave(customer);
}