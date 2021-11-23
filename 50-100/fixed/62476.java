@org.junit.Test
public void testManchesterSyntaxGeneration() throws java.lang.Exception {
    java.lang.String path = "src/test/resources/data/ontology-service/cop2.owl";
    java.lang.String abstractName = "Abstract_Single_Phenotype";
    org.lha.phenoman.man.PhenotypeOntologyManager manager = new org.lha.phenoman.man.PhenotypeOntologyManager(path, true);
    manager.addAbstractSinglePhenotype(new de.onto_med.ontology_service.AbstractSinglePhenotype(abstractName, org.semanticweb.owlapi.vocab.OWL2Datatype.XSD_INTEGER));
    manager.getManchesterSyntaxExpression(abstractName);
    if (java.nio.file.Files.exists(java.nio.file.Paths.get(path)))
        java.nio.file.Files.delete(java.nio.file.Paths.get(path));
    
}