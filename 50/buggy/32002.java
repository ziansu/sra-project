protected void valueCheck(byte value) {
    if (com.oracle.truffle.r.runtime.RRuntime.fromLogical(value)) {
        throw com.oracle.truffle.r.runtime.RError.nyi(this, "value == true");
    }
}