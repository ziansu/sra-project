@com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
@com.oracle.truffle.api.dsl.Specialization
public org.jruby.truffle.nodes.core.RubyString encode(org.jruby.truffle.nodes.core.RubyString string, org.jruby.truffle.nodes.core.RubyString encoding, @java.lang.SuppressWarnings(value = "unused")
org.jruby.truffle.nodes.core.RubyHash options) {
    return encode(string, encoding, UndefinedPlaceholder.INSTANCE);
}