@org.junit.Test
public void testDeleteGeneral() {
    createRandomGraph(4, 6);
    verifyNodeEdgeCounts(4, 6);
    repository.deleteAll(org.tierlon.neo4j.EdgeLink.class);
    verifyNodeEdgeCounts(4, 0);
    repository.deleteAll(org.tierlon.neo4j.DataNode.class);
    verifyNodeEdgeCounts(0, 0);
    createRandomGraph(3, 2);
    verifyNodeEdgeCounts(3, 2);
    repository.deleteAll(org.tierlon.neo4j.DataNode.class);
    verifyNodeEdgeCounts(0, 0);
}