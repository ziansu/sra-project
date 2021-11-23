private com.ge.research.sadl.jena.JenaBasedSadlModelValidator.TypeCheckInfo getType(com.ge.research.sadl.sADL.SadlDataType primitiveType) {
    java.lang.String nm = primitiveType.getName();
    com.ge.research.sadl.model.ConceptName cn = new com.ge.research.sadl.model.ConceptName(((com.hp.hpl.jena.vocabulary.XSD.getURI()) + nm));
    return new com.ge.research.sadl.jena.JenaBasedSadlModelValidator.TypeCheckInfo(cn, cn, this, null);
}