@com.oracle.truffle.api.dsl.Specialization
@com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
protected java.lang.Object grepValueFalse(java.lang.String patternArgVec, com.oracle.truffle.r.runtime.data.model.RAbstractStringVector vector, boolean ignoreCaseLogical, boolean valueLogical, boolean perlLogical, boolean fixedLogical, boolean useBytes, boolean invertLogical) {
    return doGrep(patternArgVec, vector, ignoreCaseLogical, valueLogical, perlLogical, fixedLogical, useBytes, invertLogical, false);
}