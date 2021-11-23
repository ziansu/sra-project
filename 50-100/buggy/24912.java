protected void checkExtraArgs(byte ignoreCase, byte perl, byte fixed, @java.lang.SuppressWarnings(value = "unused")
byte useBytes, byte invert) {
    checkNotImplemented(com.oracle.truffle.r.runtime.RRuntime.fromLogical(ignoreCase), "ignoreCase", true);
    checkNotImplemented(com.oracle.truffle.r.runtime.RRuntime.fromLogical(perl), "perl", true);
    checkNotImplemented(com.oracle.truffle.r.runtime.RRuntime.fromLogical(fixed), "fixed", true);
    checkNotImplemented(com.oracle.truffle.r.runtime.RRuntime.fromLogical(invert), "invert", true);
}