private it.unibz.inf.ontop.r2rml.OBDAMappingAxiom getMapping(eu.optique.api.mapping.TriplesMap tm) throws java.lang.Exception {
    java.lang.String sourceQuery = r2rmlParser.getSQLQuery(tm);
    java.util.List<it.unibz.inf.ontop.r2rml.Function> body = getMappingTripleAtoms(tm);
    it.unibz.inf.ontop.r2rml.OBDAMappingAxiom mapping = fac.getRDBMSMappingAxiom(("mapping-" + (tm.hashCode())), fac.getSQLQuery(sourceQuery), body);
    if (body.isEmpty()) {
        java.lang.System.out.println(("WARNING a mapping without target query will not be introduced : " + (mapping.toString())));
        return null;
    }
    return mapping;
}