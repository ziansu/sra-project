@org.junit.Test
public void testNothingInconsistent() throws java.lang.Exception {
    reasoner.processFact(triple(mvm.rya.reasoning.LocalReasonerTest.NODE, mvm.rya.reasoning.LocalReasonerTest.RDF_TYPE, Schema.OWL_NOTHING));
    mvm.rya.reasoning.ResultSet rs = reasoner.getTypes();
    org.junit.Assert.assertFalse("rdf:type owl:Nothing should be inconsistent", rs.isConsistent());
}