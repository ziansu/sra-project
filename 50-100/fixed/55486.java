@org.junit.Test
public void testTUIDCalculationAndResolutionForUnsettedElement() {
    org.eclipse.uml2.uml.Property umlProperty = createUmlModelWithProperty();
    java.lang.String expectedTUID = "name";
    java.lang.String umlPrefix = umlProperty.eClass().getEPackage().getNsPrefix();
    org.eclipse.emf.ecore.EObject resolvedEObject = testTUIDCalculator(umlPrefix, umlProperty.getClass_().getPackage(), umlProperty, expectedTUID, "name");
    org.junit.Assert.assertEquals("UAttribute could not be correctly resolved", resolvedEObject, umlProperty);
}