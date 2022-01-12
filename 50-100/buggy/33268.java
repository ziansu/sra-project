public static void attach(org.eclipse.emf.ecore.resource.Resource resource, com.hp.hpl.jena.ontology.OntModel model) {
    com.ge.research.sadl.jena.OntModelProvider.OntModelAdapter adapter = com.ge.research.sadl.jena.OntModelProvider.findAdapter(resource);
    if (adapter == null) {
        adapter = new com.ge.research.sadl.jena.OntModelProvider.OntModelAdapter();
    }
    adapter.model = model;
    adapter.isLoading = false;
    resource.eAdapters().add(adapter);
}