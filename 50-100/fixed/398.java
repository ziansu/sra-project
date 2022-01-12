public void moveDownPackageableElements(org.eclipse.uml2.uml.PackageableElement packageableElement, java.util.Collection<org.eclipse.uml2.uml.PackageableElement> packageableElementsToMove) {
    final org.obeonetwork.dsl.uml2.design.internal.services.MoveDownElementSwitch moveDownElementSwitch = new org.obeonetwork.dsl.uml2.design.internal.services.MoveDownElementSwitch();
    final java.util.List<org.eclipse.uml2.uml.PackageableElement> packageableElementsInRightOrder = retrieveTheRightOrderForPackageableElement(packageableElementsToMove);
    final java.lang.Object[] elementsArray = packageableElementsInRightOrder.toArray();
    for (int i = (elementsArray.length) - 1; i >= 0; i--) {
        if ((elementsArray[i]) instanceof org.eclipse.uml2.uml.Element) {
            moveDownElementSwitch.moveDownElement(((org.eclipse.uml2.uml.Element) (elementsArray[i])));
        }
    }
}