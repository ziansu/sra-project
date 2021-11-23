@java.lang.Deprecated
private void constructResultUnionFind(final de.uni_freiburg.informatik.ultimate.automata.nwalibrary.operations.minimization.QuotientNwaConstructor.IResultStateConstructor<STATE> resStateConstructor) {
    for (final STATE inputState : mOperand.getStates()) {
        constructStateAndSuccessors(resStateConstructor, inputState, false);
    }
}