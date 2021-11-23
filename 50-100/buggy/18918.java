@java.lang.Override
public org.wikidata.wdtk.datamodel.interfaces.StatementGroup getStatementGroup(java.util.List<org.wikidata.wdtk.datamodel.interfaces.Statement> statements) {
    java.util.List<org.wikidata.wdtk.datamodel.interfaces.Statement> newStatements = new java.util.ArrayList(statements.size());
    for (org.wikidata.wdtk.datamodel.interfaces.Statement statement : statements) {
        if (statement instanceof org.wikidata.wdtk.datamodel.json.jackson.JacksonStatement) {
            newStatements.add(statement);
        }else {
            newStatements.add(this.dataModelConverter.copy(statement));
        }
    }
    return org.wikidata.wdtk.datamodel.helpers.Datamodel.makeStatementGroup(statements);
}