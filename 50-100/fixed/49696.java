public static void addImpliedProperties(org.eclipse.emf.ecore.resource.Resource resource, java.util.Map<org.eclipse.emf.ecore.EObject, com.hp.hpl.jena.rdf.model.Property> impliedProperties) {
    if (resource != null) {
        com.ge.research.sadl.jena.OntModelProvider.OntModelAdapter a = com.ge.research.sadl.jena.OntModelProvider.findAdapter(resource);
        if (a == null) {
            a = new com.ge.research.sadl.jena.OntModelProvider.OntModelAdapter();
            a.isLoading = true;
            resource.eAdapters().add(a);
        }
        a.impliedPropertiesUsed = impliedProperties;
    }
}