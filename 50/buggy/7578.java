@org.junit.Test
public void testGetService_multipleService_shouldReturnServiceWithHighestPriority() {
    java.util.Optional<org.apache.tamaya.core.internal.DefaultServiceContextTest.MultiImplsInterface> service = context.getService(org.apache.tamaya.core.internal.DefaultServiceContextTest.MultiImplsInterface.class);
    org.junit.Assert.assertTrue(service.isPresent());
    org.junit.Assert.assertTrue(((service.get()) instanceof org.apache.tamaya.core.internal.DefaultServiceContextTest.MultiImpl2));
}