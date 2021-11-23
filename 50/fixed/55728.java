@org.junit.Test
public void testURIResolverTestCase3AWebOnt2Ddescription2Dlogic2D902() {
    java.lang.String premiseOntology = ((((rdf) + " xml:base=\"urn:test\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"urn:test#r\"/><owl:ObjectProperty rdf:about=\"urn:test#p\"><rdfs:subPropertyOf rdf:resource=\"urn:test#r\"/><rdfs:range>") + "<owl:Class rdf:about=\"urn:test#A\"/></rdfs:range></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#q\"><rdfs:subPropertyOf rdf:resource=\"urn:test#r\"/><rdfs:range>") + "<owl:Class rdf:about=\"urn:test#B\"/></rdfs:range></owl:ObjectProperty>") + "<owl:Class rdf:about=\"urn:test#A\"><owl:disjointWith rdf:resource=\"urn:test#B\"/></owl:Class></rdf:RDF>";
    test(premiseOntology, true, true, true, true);
}