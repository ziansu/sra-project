@org.junit.Test
public void test3() throws java.lang.Exception {
    try (org.neo4j.driver.v1.Transaction tx = session.beginTransaction()) {
        tx.run("CREATE (a:Person {name: $name})", org.neo4j.driver.v1.Values.parameters("name", "Alice"));
        tx.success();
    }
    final java.lang.String PERSONS_QUERY = "persons";
    session.registerQuery(PERSONS_QUERY, "MATCH (a:Person) RETURN a");
    runUpdate(session, "CREATE (a:Person {name: $name})", org.neo4j.driver.v1.Values.parameters("name", "Bob"));
}