public static clausal_discovery.validity.ValidityTable create(vector.Vector<clausal_discovery.validity.ValidatedClause> clauses) {
    vector.Vector<logic.example.Example> examples = (clauses.isEmpty()) ? clauses.getFirst().getLogicBase().getExamples() : new vector.Vector();
    return new clausal_discovery.validity.ValidityTable(clausal_discovery.validity.ValidityTable.createValidityMap(clauses), examples);
}