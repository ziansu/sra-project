@org.junit.Test
public void parsesQueryWrittenInCondensedString() throws java.lang.Exception {
    final java.lang.String query = "SELECT ?x WHERE { ?x a ?y. } ORDER BY DESC(?y)";
    final cz.cvut.kbss.jopa.query.QueryHolder holder = queryParser.parseQuery(query);
    assertEquals(2, holder.getParameters().size());
    assertTrue(holder.getParameters().contains(new cz.cvut.kbss.jopa.query.QueryParameter("x")));
    assertTrue(holder.getParameters().contains(new cz.cvut.kbss.jopa.query.QueryParameter("y")));
    assertEquals(query, holder.assembleQuery());
}