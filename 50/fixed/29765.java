private boolean escapes(java.util.List<org.teavm.javascript.Statement> statements) {
    return new org.teavm.javascript.EscapingStatementFinder().check(statements);
}