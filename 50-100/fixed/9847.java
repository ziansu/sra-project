public java.util.List<de.uni_freiburg.informatik.ultimate.plugins.analysis.abstractinterpretationv2.domain.nonrelational.interval.IntervalDomainState> process(final de.uni_freiburg.informatik.ultimate.plugins.analysis.abstractinterpretationv2.domain.nonrelational.interval.IntervalDomainState oldState, final de.uni_freiburg.informatik.ultimate.model.boogie.ast.Statement statement) {
    mReturnState = new java.util.ArrayList<>();
    assert oldState != null;
    assert statement != null;
    mOldState = oldState;
    mLhsVariable = null;
    processStatement(statement);
    assert ((oldState.getVariables().size()) == 0) || ((mReturnState.size()) != 0);
    return mReturnState;
}