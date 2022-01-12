public static java.util.Set<java.lang.String> getFacets() {
    return org.semanticweb.owlapi.util.OWLAPIStreamUtils.asSet(org.semanticweb.owlapi.vocab.OWLFacet.stream().map(( v) -> v.getSymbolicForm()));
}