private static boolean isRWLock(com.google.errorprone.bugpatterns.threadsafety.GuardedByExpression guard, com.google.errorprone.VisitorState state) {
    com.sun.tools.javac.code.Symbol guardSym = guard.sym();
    if (guardSym == null) {
        return false;
    }
    com.sun.tools.javac.code.Type guardType = guardSym.type;
    if (guardType == null) {
        return false;
    }
    com.sun.tools.javac.code.Symbol rwLockSymbol = state.getSymbolFromString(com.google.errorprone.bugpatterns.threadsafety.GuardedByChecker.JUC_READ_WRITE_LOCK);
    if (rwLockSymbol == null) {
        return false;
    }
    return state.getTypes().isSubtype(guardType, rwLockSymbol.type);
}