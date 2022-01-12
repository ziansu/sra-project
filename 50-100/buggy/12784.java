@com.oracle.truffle.api.dsl.Specialization
public org.jruby.truffle.nodes.core.RubyString encode(org.jruby.truffle.nodes.core.RubyString string, org.jruby.truffle.nodes.core.RubyString encoding, @java.lang.SuppressWarnings(value = "unused")
org.jruby.truffle.runtime.UndefinedPlaceholder options) {
    notDesignedForCompilation();
    final org.jruby.truffle.nodes.core.org.jruby.RubyString jrubyString = getContext().toJRuby(string);
    final org.jruby.truffle.nodes.core.org.jruby.RubyString jrubyEncodingString = getContext().toJRuby(encoding);
    final org.jruby.truffle.nodes.core.org.jruby.RubyString jrubyTranscoded = ((org.jruby.truffle.nodes.core.org.jruby.RubyString) (jrubyString.encode(getContext().getRuntime().getCurrentContext(), jrubyEncodingString)));
    return getContext().toTruffle(jrubyTranscoded);
}