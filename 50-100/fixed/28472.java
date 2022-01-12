private void visitInsert(org.eclipse.rdf4j.model.Resource insert) throws org.eclipse.rdf4j.RDF4JException {
    org.eclipse.rdf4j.common.iteration.Iteration<? extends org.eclipse.rdf4j.model.Resource, org.eclipse.rdf4j.query.QueryEvaluationException> groupIter = org.eclipse.rdf4j.query.algebra.evaluation.util.TripleSources.listResources(insert, store);
    while (groupIter.hasNext()) {
        org.eclipse.rdf4j.model.Resource r = groupIter.next();
        org.eclipse.rdf4j.model.Value type = org.eclipse.rdf4j.query.algebra.evaluation.util.TripleSources.singleValue(r, RDF.TYPE, store);
        visitPattern(r, (type != null ? java.util.Collections.singleton(((org.eclipse.rdf4j.model.IRI) (type))) : java.util.Collections.<org.eclipse.rdf4j.model.IRI>emptySet()), null);
    } 
}