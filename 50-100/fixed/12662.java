public void compute(com.hp.hpl.jena.sparql.core.Quad quad) {
    eu.diachron.qualitymetrics.accessibility.availability.RDFAccessibility.logger.debug("Assessing {}", quad.asTriple().toString());
    if (quad.getPredicate().getURI().equals(VOID.dataDump.getURI())) {
        (totalDataDumps)++;
    }
}