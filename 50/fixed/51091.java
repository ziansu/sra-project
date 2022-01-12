@com.oracle.truffle.api.dsl.Specialization
public final boolean doDouble(final double left, final long right) {
    return doDouble(left, ((double) (right)));
}