@org.junit.Test
public void decisionNodeHaveOneAndAtMostTwoIncomingObjectFlows() {
    org.eclipse.uml2.uml.DecisionNode node = UMLFactory.eINSTANCE.createDecisionNode();
    org.eclipse.uml2.uml.ObjectFlow flow = UMLFactory.eINSTANCE.createObjectFlow();
    node.getIncomings().add(flow);
    org.junit.Assert.assertTrue(services.isValidActivityEdgeEnd(node));
    org.eclipse.uml2.uml.ObjectFlow flow2 = UMLFactory.eINSTANCE.createObjectFlow();
    node.getIncomings().add(flow2);
    org.junit.Assert.assertFalse(services.isValidActivityEdgeEnd(node));
}