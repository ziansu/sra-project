private void runUpdate(neo4j.driver.reactive.interfaces.ReactiveSession session, java.lang.String query, java.lang.String statementTemplate, org.neo4j.driver.v1.Value parameters) {
    java.lang.System.out.println(("Running query: " + statementTemplate));
    java.lang.System.out.println(("With parameters: " + parameters));
    try (org.neo4j.driver.v1.Transaction tx = session.beginTransaction()) {
        tx.run(statementTemplate, parameters);
        tx.success();
    }
}