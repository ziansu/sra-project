public void moveUpEnumerationLiterals(org.eclipse.uml2.uml.EnumerationLiteral currentEnumerationLiteral, java.util.List<org.eclipse.uml2.uml.EnumerationLiteral> enumerationLiteralsToMove) {
    final java.util.List<org.eclipse.uml2.uml.EnumerationLiteral> enumerationLiteralsInRightOrder = retrieveTheRightOrderForEnumerationLiteral(enumerationLiteralsToMove);
    final org.obeonetwork.dsl.uml2.design.internal.services.MoveUpElementSwitch moveUpElementsSwitch = new org.obeonetwork.dsl.uml2.design.internal.services.MoveUpElementSwitch();
    final java.util.Iterator<org.eclipse.uml2.uml.EnumerationLiteral> iterator = enumerationLiteralsInRightOrder.iterator();
    while (iterator.hasNext()) {
        final org.eclipse.uml2.uml.EnumerationLiteral enumerationLiteral = iterator.next();
        moveUpElementsSwitch.moveUpElement(enumerationLiteral);
    } 
}