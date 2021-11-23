@com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
@com.oracle.truffle.api.dsl.Specialization(guards = "isRubyString(name) || isRubySymbol(name)")
public java.lang.Object importObject(com.oracle.truffle.api.object.DynamicObject name) {
    return getContext().getInteropManager().importObject(name);
}