private void addSadlBaseModelImportToJenaModel(org.eclipse.emf.ecore.resource.Resource resource) throws com.ge.research.sadl.jena.JenaProcessorException, com.ge.research.sadl.reasoner.ConfigurationException, java.io.IOException, java.net.URISyntaxException {
    if ((sadlBaseModel) == null) {
        sadlBaseModel = com.ge.research.sadl.jena.OntModelProvider.getSadlBaseModel();
        if ((sadlBaseModel) == null) {
            sadlBaseModel = getOntModelFromString(resource, com.ge.research.sadl.jena.JenaBasedSadlModelProcessor.getSadlBaseModel());
            com.ge.research.sadl.jena.OntModelProvider.setSadlBaseModel(sadlBaseModel);
        }
    }
    addImportToJenaModel(getModelName(), SadlConstants.SADL_BASE_MODEL_URI, SadlConstants.SADL_BASE_MODEL_PREFIX, sadlBaseModel);
}