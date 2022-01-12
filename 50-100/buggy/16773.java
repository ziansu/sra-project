@org.junit.Test
@org.semanticweb.owlapi.profiles.test.Tests(method = "public Object visit(OWLDisjointDataPropertiesAxiom axiom)")
public void shouldCreateViolationForOWLDisjointDataPropertiesAxiomInOWL2RLProfile() throws java.lang.Exception {
    org.semanticweb.owlapi.profiles.test.OWLOntology o = org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.createOnto();
    org.semanticweb.owlapi.profiles.test.OWLOntologyManager m = o.getOWLOntologyManager();
    org.semanticweb.owlapi.profiles.test.OWLDataProperty dp = DataProperty(IRI("urn:test#dproperty"));
    declare(o, org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.DATAP, dp);
    m.addAxiom(o, DisjointDataProperties(org.semanticweb.owlapi.profiles.test.OWLProfileTestCase.DATAP, dp));
    org.semanticweb.owlapi.profiles.test.OWL2RLProfile profile = new org.semanticweb.owlapi.profiles.test.OWL2RLProfile();
    int expected = 1;
    java.lang.Class[] expectedViolations = new java.lang.Class[]{ org.semanticweb.owlapi.profiles.test.UseOfIllegalAxiom.class };
    runAssert(o, profile, expected, expectedViolations);
}