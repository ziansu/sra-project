private void compileGroup() {
    org.eclipse.persistence.jpa.jpql.parser.GroupByClause groupByClause = null;
    if (query.isSelectStatement()) {
        groupByClause = ((org.eclipse.persistence.jpa.jpql.parser.GroupByClause) (query.getSelectStatement().getGroupByClause()));
    }
    if ((groupByClause == null) || ((groupByClause.toActualText().length()) == 0)) {
        throw new com.impetus.kundera.query.JPQLParseException("keyword without value: GROUP BY");
    }
    groupingClause = groupByClause.toActualText();
}