@java.lang.Override
public org.neo4j.driver.v1.StatementResult run(org.neo4j.driver.v1.Statement statement) {
    final org.neo4j.graphdb.Result internalResult = gds.execute(statement.text());
    return new neo4j.driver.testkit.data.EmbeddedTestkitStatementResult(internalResult);
}