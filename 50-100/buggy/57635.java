private java.lang.String getTripleString() {
    java.lang.String triplesString = rdfbones.lib.SPARQLUtils.assembleTriples(edu.cornell.mannlib.vitro.webapp.search.controller.DataTransformationAJAXController.getDataTriples());
    triplesString += " ?dataTransformation  rdf:type obo:OBI_0200000  . ";
    triplesString = edu.cornell.mannlib.vitro.webapp.dao.jena.QueryUtils.subUrisForQueryLiterals(triplesString, getLiteralMap());
    triplesString = edu.cornell.mannlib.vitro.webapp.dao.jena.QueryUtils.subUrisForQueryVars(triplesString, getDataMap());
    triplesString += getInputs();
    return triplesString;
}