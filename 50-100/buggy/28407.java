private tr.com.srdc.ontmalizer.OntClass convertListOrUnion(java.lang.String URI) {
    tr.com.srdc.ontmalizer.OntClass dataType = ontology.createOntResource(tr.com.srdc.ontmalizer.OntClass.class, RDFS.Datatype, (URI + (Constants.DATATYPE_SUFFIX)));
    org.apache.jena.rdf.model.Resource anySimpleType = ontology.getResource(((org.apache.jena.vocabulary.XSD.getURI()) + "anySimpleType"));
    dataType.addSuperClass(anySimpleType);
    tr.com.srdc.ontmalizer.OntClass eqDataType = ontology.createOntResource(tr.com.srdc.ontmalizer.OntClass.class, RDFS.Datatype, null);
    eqDataType.addProperty(OWL2.onDatatype, anySimpleType);
    dataType.addEquivalentClass(eqDataType);
    return dataType;
}