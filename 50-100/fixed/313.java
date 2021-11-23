@org.junit.Test
public void itShouldRegisterStandardMBeans() throws java.lang.Exception {
    final io.datakernel.jmx.StandardMBeansRegistrationTest.ServiceStub service = new io.datakernel.jmx.StandardMBeansRegistrationTest.ServiceStub();
    context.checking(new org.jmock.Expectations() {
        {
            oneOf(mBeanServer).registerMBean(with(any(java.lang.Object.class)), with(io.datakernel.jmx.helper.CustomMatchers.objectname(((domain) + ":type=ServiceStub"))));
        }
    });
    com.google.inject.Key<?> key = com.google.inject.Key.get(io.datakernel.jmx.StandardMBeansRegistrationTest.ServiceStub.class);
    jmxRegistry.registerSingleton(key, service);
}