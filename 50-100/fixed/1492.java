@java.lang.SuppressWarnings(value = "unchecked")
@org.junit.Test
public void testFindProvidersMultipleInterfacesWithProviderFirst() {
    java.util.List<java.lang.Class<?>> classesInBundle = java.util.Arrays.asList(no.steria.osgi.jsr330activator.testbundle.HelloService2.class, no.steria.osgi.jsr330activator.testbundle.implementation.HelloServiceImplementation.class, no.steria.osgi.jsr330activator.testbundle.implementation.HelloServiceProvider2.class);
    no.steria.osgi.jsr330activator.Jsr330Activator activator = new no.steria.osgi.jsr330activator.Jsr330Activator();
    java.util.Map<java.lang.reflect.Type, java.util.List<java.lang.Class<?>>> providers = activator.findProviders(classesInBundle);
    assertEquals(1, providers.size());
    assertEquals(no.steria.osgi.jsr330activator.testbundle.implementation.HelloServiceProvider2.class, providers.get(no.steria.osgi.jsr330activator.testbundle.HelloService.class).get(0));
}