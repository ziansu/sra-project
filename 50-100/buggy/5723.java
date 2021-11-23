@org.junit.Test
public void shouldHandleNewLine() throws java.lang.Throwable {
    org.neo4j.bolt.v1.runtime.Session session = env.newSession("<test>");
    session.init("TestClient/1.0", java.util.Collections.emptyMap(), null, null);
    session.run(java.lang.System.lineSeparator(), org.neo4j.bolt.v1.runtime.integration.SessionIT.EMPTY_PARAMS, null, responses);
    session.pullAll("", responses);
    org.hamcrest.MatcherAssert.assertThat(responses.next(), org.neo4j.bolt.v1.runtime.integration.SessionMatchers.failedWith(Status.Statement.SyntaxError));
}