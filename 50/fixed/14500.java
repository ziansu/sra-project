@com.oracle.truffle.api.dsl.Fallback
@com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
protected com.oracle.truffle.r.runtime.data.RDoubleVector doRaw(@java.lang.SuppressWarnings(value = "unused")
java.lang.Object a, @java.lang.SuppressWarnings(value = "unused")
java.lang.Object b) {
    throw com.oracle.truffle.r.runtime.RError.error(this, RError.Message.NUMERIC_COMPLEX_MATRIX_VECTOR);
}