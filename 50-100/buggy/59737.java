@org.junit.Test
public void testWithUnmanagedComponent(javax.enterprise.inject.spi.BeanManager manager) {
    javax.enterprise.inject.spi.Unmanaged<org.jboss.weld.tests.interceptors.resource.InterceptedBean> unmanaged = new javax.enterprise.inject.spi.Unmanaged(manager, org.jboss.weld.tests.interceptors.resource.InterceptedBean.class);
    javax.enterprise.inject.spi.Unmanaged.UnmanagedInstance<org.jboss.weld.tests.interceptors.resource.InterceptedBean> instance = unmanaged.newInstance();
    org.jboss.weld.tests.interceptors.resource.InterceptedBean reference = instance.produce().inject().postConstruct().get();
    junit.framework.Assert.assertNotNull(reference.ping(null));
    instance.preDestroy().dispose();
}