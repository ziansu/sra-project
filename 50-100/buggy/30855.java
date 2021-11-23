protected static void classTearDown() {
    com.runwaysdk.business.ontology.AbstractOntologyStrategyTest.shutDownStrat(com.runwaysdk.business.ontology.AbstractOntologyStrategyTest.mdTerm.definesType());
    com.runwaysdk.dataaccess.io.TestFixtureFactory.delete(com.runwaysdk.business.ontology.AbstractOntologyStrategyTest.TermHolder.getTermA());
    com.runwaysdk.dataaccess.io.TestFixtureFactory.delete(com.runwaysdk.business.ontology.AbstractOntologyStrategyTest.TermHolder.getTermB());
    com.runwaysdk.dataaccess.io.TestFixtureFactory.delete(com.runwaysdk.business.ontology.AbstractOntologyStrategyTest.TermHolder.getTermC());
    com.runwaysdk.system.metadata.MdRelationship.get(com.runwaysdk.business.ontology.AbstractOntologyStrategyTest.mdTermRelationshipId).delete();
    com.runwaysdk.system.metadata.MdBusiness.get(com.runwaysdk.business.ontology.AbstractOntologyStrategyTest.mdTermId).delete();
    com.runwaysdk.business.ontology.AbstractOntologyStrategyTest.didDoSetUp = false;
}