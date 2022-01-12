protected java.util.List<soot.Unit> throwNewException(soot.Body b, soot.SootClass exc, soot.tagkit.Host createdFrom) {
    java.util.List<soot.Unit> result = createNewException(b, exceptionVariable, exc, createdFrom);
    result.add(throwStmtFor(exceptionVariable, createdFrom));
    return result;
}