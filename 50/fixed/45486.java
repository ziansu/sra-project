@org.junit.Before
public void setup() throws java.io.IOException {
    engine = new org.neo4j.cypher.javacompat.ExecutionEngine(new org.neo4j.test.TestGraphDatabaseFactory().newImpermanentDatabase(), logger);
}