@org.junit.Test
public void forkNodeHaveOneIncomingObjectFlow() {
    org.eclipse.uml2.uml.ForkNode node = UMLFactory.eINSTANCE.createForkNode();
    org.eclipse.uml2.uml.ObjectFlow flow = UMLFactory.eINSTANCE.createObjectFlow();
    node.getIncomings().add(flow);
    org.junit.Assert.assertFalse(services.isValidActivityEdgeEnd(null, node));
}