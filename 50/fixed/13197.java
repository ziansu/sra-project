protected com.ge.research.sadl.jena.JenaBasedSadlModelValidator.TypeCheckInfo getVariableType(com.ge.research.sadl.model.ConceptName.ConceptType variable, java.lang.String conceptUri, org.eclipse.emf.ecore.EObject expression) throws com.ge.research.sadl.jena.DontTypeCheckException {
    com.ge.research.sadl.model.ConceptName declarationConceptName = new com.ge.research.sadl.model.ConceptName("TODO");
    return new com.ge.research.sadl.jena.JenaBasedSadlModelValidator.TypeCheckInfo(declarationConceptName, declarationConceptName, this, expression);
}