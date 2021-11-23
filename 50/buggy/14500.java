@java.lang.SuppressWarnings(value = "unused")
@com.oracle.truffle.api.dsl.Specialization
protected com.oracle.truffle.r.runtime.data.RDoubleVector doRaw(java.lang.Object a, com.oracle.truffle.r.runtime.data.model.RAbstractRawVector b) {
    throw com.oracle.truffle.r.runtime.RError.error(this, RError.Message.NUMERIC_COMPLEX_MATRIX_VECTOR);
}