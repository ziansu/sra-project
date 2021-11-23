private void expectOnSave(java.lang.Object object, java.lang.String... cypher) {
    org.neo4j.ogm.cypher.statement.ParameterisedStatements statements = new org.neo4j.ogm.cypher.statement.ParameterisedStatements(this.mapper.map(object).getStatements());
    for (java.lang.String s : cypher) {
        if (s.equals(statements.getStatements().get(0).getStatement())) {
            return ;
        }
    }
    fail((("unexpected: '" + (statements.getStatements().get(0).getStatement())) + "'"));
}