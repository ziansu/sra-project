public void moveUpOperations(org.eclipse.uml2.uml.Operation currentOperation, java.util.List<org.eclipse.uml2.uml.Operation> operationsToMove) {
    final java.util.List<org.eclipse.uml2.uml.Operation> operationsInRightOrder = retrieveTheRightOrderForOperation(operationsToMove);
    final org.obeonetwork.dsl.uml2.design.internal.services.MoveUpElementSwitch moveUpElementsSwitch = new org.obeonetwork.dsl.uml2.design.internal.services.MoveUpElementSwitch();
    final java.util.Iterator<org.eclipse.uml2.uml.Operation> iterator = operationsInRightOrder.iterator();
    while (iterator.hasNext()) {
        final org.eclipse.uml2.uml.Operation operation = iterator.next();
        moveUpElementsSwitch.moveUpElement(operation);
    } 
}