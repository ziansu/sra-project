@org.junit.Test
public void testRequestHasNoImplementation() throws java.lang.Exception {
    org.ow2.petals.camel.se.COMPONENT_UNDER_TEST.deployService(org.ow2.petals.camel.se.SU_NAME, createHelloService(org.ow2.petals.camel.se.WSDL11, null, null));
    final org.ow2.petals.component.framework.junit.ResponseMessage response = sendHello(org.ow2.petals.camel.se.SU_NAME, "", null, "", null, false, false, org.ow2.petals.camel.se.MessageChecks.none());
    assertTrue(((response.getError()) instanceof javax.jbi.messaging.MessagingException));
    assertTrue(response.getError().getMessage().contains(org.ow2.petals.camel.se.exceptions.NotImplementedRouteException.class.getName()));
}