public void registerNewPIMInstanceModel(eu.h2020.symbiote.core.model.Platform pimInstanceModel) {
    eu.h2020.symbiote.ontology.SemanticManager.log.info(("Registering new PIM instance " + (pimInstanceModel.toString())));
    eu.h2020.symbiote.ontology.List<java.lang.String> pimLabels = pimInstanceModel.getLabels();
    if (pimLabels != null) {
        eu.h2020.symbiote.ontology.SemanticManager.log.info((("[NYI] Model for platform " + pimLabels) + " will be implemented in R3"));
    }else {
        eu.h2020.symbiote.ontology.SemanticManager.log.error("Could not find platform's label");
    }
}