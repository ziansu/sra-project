public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> load(java.lang.String path) throws java.io.FileNotFoundException, java.io.IOException {
    org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> answer = null;
    DartPackage.eINSTANCE.eClass();
    org.eclipse.emf.ecore.resource.Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    java.util.Map<java.lang.String, java.lang.Object> map = reg.getExtensionToFactoryMap();
    map.put("dart", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl());
    org.eclipse.emf.ecore.resource.ResourceSet resSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
    org.eclipse.emf.ecore.resource.Resource resource = resSet.getResource(org.eclipse.emf.common.util.URI.createURI(path), true);
    answer = resource.getContents();
    return answer;
}