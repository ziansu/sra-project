@java.lang.Override
public boolean checkAlwaysConsumed(nez.expr.GrammarChecker checker, java.lang.String startNonTerminal, nez.util.UList<java.lang.String> stack) {
    if ((!(this.inner.checkAlwaysConsumed(checker, startNonTerminal, stack))) && (checker != null)) {
        checker.reportWarning(s, ("unconsumed expression: " + (this.inner)));
    }
    return true;
}