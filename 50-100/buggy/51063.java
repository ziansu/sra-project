private de.uni_freiburg.informatik.ultimate.plugins.generator.traceabstraction.singletracecheck.TraceChecker constructDefault() {
    final de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.predicates.IPredicate precondition = mPredicateUnifier.getTruePredicate();
    final de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.predicates.IPredicate postcondition = mPredicateUnifier.getFalsePredicate();
    final de.uni_freiburg.informatik.ultimate.plugins.generator.traceabstraction.singletracecheck.TraceChecker traceChecker;
    traceChecker = new de.uni_freiburg.informatik.ultimate.plugins.generator.traceabstraction.tracehandling.TraceCheckerConstructor.DefaultTraceChecker(precondition, postcondition, new java.util.TreeMap<java.lang.Integer, de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.predicates.IPredicate>(), de.uni_freiburg.informatik.ultimate.automata.nestedword.NestedWord.nestedWord(mCounterexample.getWord()), mPrefs.getCfgSmtToolkit(), mAssertionOrder, mServices, true);
    return traceChecker;
}