@com.oracle.truffle.api.dsl.Specialization(guards = "!isRubyRange(indexOrRange)")
public java.lang.Object stringByteSubstring(com.oracle.truffle.api.object.DynamicObject string, java.lang.Object indexOrRange, java.lang.Object length) {
    return null;
}