public static boolean isObjectProperty(com.hp.hpl.jena.graph.Node term) {
    java.lang.String ns = term.getNameSpace();
    if (!(eu.diachron.qualitymetrics.utilities.VocabularyLoader.objectProperties.containsKey(term.getURI()))) {
        com.hp.hpl.jena.ontology.OntModel m = ((com.hp.hpl.jena.ontology.OntModel) (eu.diachron.qualitymetrics.utilities.VocabularyLoader.getModelForVocabulary(ns)));
        eu.diachron.qualitymetrics.utilities.VocabularyLoader.objectProperties.put(term.getURI(), ((m.getObjectProperty(term.getURI())) != null));
    }
    return eu.diachron.qualitymetrics.utilities.VocabularyLoader.objectProperties.get(term.getURI());
}