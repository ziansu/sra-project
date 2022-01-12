public org.osate.xtext.aadl2.properties.linking.Namespace getContainingTopLevelNamespace(org.eclipse.emf.ecore.EObject element) {
    org.eclipse.emf.ecore.EObject container = element.eContainer();
    while (((container != null) && (!(container instanceof org.osate.xtext.aadl2.properties.linking.PackageSection))) && (!(container instanceof org.osate.xtext.aadl2.properties.linking.PropertySet)))
        container = container.eContainer();
    
    return ((org.osate.xtext.aadl2.properties.linking.Namespace) (container));
}