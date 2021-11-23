@com.oracle.truffle.api.dsl.Specialization(guards = "!isRubyRange(index)")
public java.lang.Object stringByteSubstring(com.oracle.truffle.api.object.DynamicObject string, com.oracle.truffle.api.object.DynamicObject index, java.lang.Object length) {
    return null;
}