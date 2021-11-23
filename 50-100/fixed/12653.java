public void moveUpPackageableElements(org.eclipse.uml2.uml.PackageableElement packageableElement, java.util.Collection<org.eclipse.uml2.uml.PackageableElement> packageableElementsToMove) {
    final org.obeonetwork.dsl.uml2.design.internal.services.MoveUpElementSwitch moveUpElementsSwitch = new org.obeonetwork.dsl.uml2.design.internal.services.MoveUpElementSwitch();
    final java.util.List<org.eclipse.uml2.uml.PackageableElement> packageableElementsInRightOrder = retrieveTheRightOrderForPackageableElement(packageableElementsToMove);
    final java.util.Iterator<org.eclipse.uml2.uml.PackageableElement> iterator = packageableElementsInRightOrder.iterator();
    while (iterator.hasNext()) {
        final org.eclipse.uml2.uml.Element element = iterator.next();
        moveUpElementsSwitch.moveUpElement(element);
    } 
}