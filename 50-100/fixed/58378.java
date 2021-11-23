@java.lang.Override
public void visit(org.teavm.javascript.TryCatchStatement statement) {
    java.util.Map<org.teavm.javascript.BlockStatement, java.util.List<org.teavm.javascript.Statement>> oldBlockSuccessors = blockSuccessors;
    java.util.Set<org.teavm.javascript.IdentifiedStatement> oldOuterStatements = outerStatements;
    outerStatements = new java.util.HashSet<>();
    blockSuccessors = new java.util.HashMap<>();
    processSequence(statement.getProtectedBody());
    outerStatements = oldOuterStatements;
    blockSuccessors = oldBlockSuccessors;
    processSequence(statement.getHandler());
}