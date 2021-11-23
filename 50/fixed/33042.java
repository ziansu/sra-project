@com.oracle.truffle.api.dsl.Specialization
@com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
protected com.oracle.truffle.r.runtime.data.RStringVector gsub(java.lang.String patternArgVec, java.lang.String replacementVec, com.oracle.truffle.r.runtime.data.model.RAbstractStringVector x, boolean ignoreCaseLogical, boolean perlLogical, boolean fixedLogical, boolean useBytes) {
    return doSub(patternArgVec, replacementVec, x, ignoreCaseLogical, perlLogical, fixedLogical, useBytes, true);
}