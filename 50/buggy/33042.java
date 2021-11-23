@com.oracle.truffle.api.dsl.Specialization
@com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
protected com.oracle.truffle.r.runtime.data.RStringVector gsub(com.oracle.truffle.r.runtime.data.model.RAbstractStringVector patternArgVec, com.oracle.truffle.r.runtime.data.model.RAbstractStringVector replacementVec, com.oracle.truffle.r.runtime.data.model.RAbstractStringVector x, byte ignoreCaseLogical, byte perlLogical, byte fixedLogical, byte useBytes) {
    return doSub(patternArgVec, replacementVec, x, ignoreCaseLogical, perlLogical, fixedLogical, useBytes, true);
}