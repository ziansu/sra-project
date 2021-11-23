@com.oracle.truffle.api.dsl.Specialization(guards = { "!isRubyString(arguments[1])" , "!isRubyEncoding(arguments[1])" , "!isUndefinedPlaceholder(arguments[1])" })
public org.jruby.truffle.nodes.core.RubyString encode(com.oracle.truffle.api.frame.VirtualFrame frame, org.jruby.truffle.nodes.core.RubyString string, java.lang.Object encoding, org.jruby.truffle.runtime.UndefinedPlaceholder options) {
    notDesignedForCompilation();
    if ((toStrNode) == null) {
        com.oracle.truffle.api.CompilerDirectives.transferToInterpreter();
        toStrNode = insert(org.jruby.truffle.nodes.coerce.ToStrNodeFactory.create(getContext(), getSourceSection(), null));
    }
    return encode(string, toStrNode.executeRubyString(frame, encoding), options);
}