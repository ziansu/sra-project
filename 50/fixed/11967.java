@org.junit.Test
public void testMeteredClassInterface() {
    org.junit.Assert.assertNotNull("Expected to be able to get MeteredInterface by interface and not by class.", ctx.getBean(com.ryantenney.metrics.spring.MeteredClassImpementsInterfaceTest.MeteredClassInterface.class));
}