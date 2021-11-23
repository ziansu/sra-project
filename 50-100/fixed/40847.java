@org.junit.Test
public void test2() throws java.lang.Exception {
    final java.lang.String PERSONS_QUERY = "persons";
    session.registerQuery(PERSONS_QUERY, "MATCH (a:Person) RETURN a");
    runUpdate(session, "CREATE (a:Person {name: $name})", org.neo4j.driver.v1.Values.parameters("name", "Alice"));
    runUpdate(session, "CREATE (a:Person {name: $name})", org.neo4j.driver.v1.Values.parameters("name", "Bob"));
}