public void moveDownOperations(org.eclipse.uml2.uml.Operation currentOperation, java.util.List<org.eclipse.uml2.uml.Operation> operationsToMove) {
    final java.util.List<org.eclipse.uml2.uml.Operation> operationsInRightOrder = retrieveTheRightOrderForOperation(operationsToMove);
    final java.lang.Object[] operationsArray = operationsInRightOrder.toArray();
    final org.obeonetwork.dsl.uml2.design.internal.services.MoveDownElementSwitch moveDownElementSwitch = new org.obeonetwork.dsl.uml2.design.internal.services.MoveDownElementSwitch();
    for (int i = (operationsArray.length) - 1; i >= 0; i--) {
        if ((operationsArray[i]) instanceof org.eclipse.uml2.uml.Operation) {
            moveDownElementSwitch.moveDownElement(((org.eclipse.uml2.uml.Operation) (operationsArray[i])));
        }
    }
}