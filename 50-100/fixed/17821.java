public static org.eclipse.emf.ecore.resource.ResourceSet createGenerationResourceSet(org.eclipse.emf.ecore.EPackage.Registry registry) {
    final org.eclipse.emf.ecore.resource.ResourceSet rs = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
    rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl());
    rs.setPackageRegistry(registry);
    rs.getURIConverter().getURIMap().putAll(org.eclipse.emf.ecore.plugin.EcorePlugin.computePlatformURIMap(false));
    return rs;
}