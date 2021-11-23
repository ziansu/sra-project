@com.oracle.truffle.api.dsl.Specialization
@com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
protected java.lang.Object grepl(com.oracle.truffle.r.runtime.data.model.RAbstractStringVector patternArgVec, com.oracle.truffle.r.runtime.data.model.RAbstractStringVector vector, byte ignoreCaseLogical, byte valueLogical, byte perlLogical, byte fixedLogical, byte useBytes, byte invertLogical) {
    return doGrep(patternArgVec, vector, ignoreCaseLogical, valueLogical, perlLogical, fixedLogical, useBytes, invertLogical, true);
}