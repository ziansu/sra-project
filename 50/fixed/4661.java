@com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
@com.oracle.truffle.api.dsl.Specialization(guards = "isRubyString(name) || isRubySymbol(name)")
public java.lang.Object export(com.oracle.truffle.api.object.DynamicObject name, com.oracle.truffle.api.interop.TruffleObject object) {
    getContext().getInteropManager().exportObject(name.toString(), object);
    return object;
}