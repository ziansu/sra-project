public static void addOtherContent(org.eclipse.emf.ecore.resource.Resource resource, java.lang.Object otherContent) {
    com.ge.research.sadl.processing.OntModelProvider.OntModelAdapter adapter = com.ge.research.sadl.processing.OntModelProvider.findAdapter(resource);
    if (adapter == null) {
        adapter = new com.ge.research.sadl.processing.OntModelProvider.OntModelAdapter();
        adapter.isLoading = true;
        resource.eAdapters().add(adapter);
    }
    if ((adapter.otherContent) == null) {
        adapter.otherContent = new java.util.ArrayList<java.lang.Object>();
    }
    if (!(adapter.otherContent.contains(otherContent))) {
        adapter.otherContent.add(otherContent);
    }
}