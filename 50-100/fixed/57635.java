private java.lang.String getTripleString() {
    java.lang.String triplesString = edu.cornell.mannlib.vitro.webapp.search.controller.DataTransformationAJAXController.getDataTriples();
    triplesString = edu.cornell.mannlib.vitro.webapp.dao.jena.QueryUtils.subUrisForQueryLiterals(triplesString, getLiteralMap());
    triplesString = edu.cornell.mannlib.vitro.webapp.dao.jena.QueryUtils.subUrisForQueryVars(triplesString, getDataMap());
    triplesString += getInputs();
    return triplesString;
}