@org.junit.Test
public void testAddRelation() {
    try {
        getFixture().getRelations().add(createRelation());
        org.junit.Assert.fail("Should not add a node in layer's node list directly.");
    } catch (java.lang.UnsupportedOperationException e) {
    }
}