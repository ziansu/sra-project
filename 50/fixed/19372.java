public boolean visit(org.eclipse.jdt.core.dom.ForStatement statement) {
    int line = cu.getLineNumber(statement.getStartPosition());
    if (line == (conditionLineNumber)) {
        setScope(statement, true);
        return false;
    }
    return true;
}