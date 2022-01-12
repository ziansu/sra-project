@com.oracle.truffle.api.dsl.Specialization
public java.lang.Object slice(com.oracle.truffle.api.frame.VirtualFrame frame, org.jruby.truffle.nodes.core.RubyString string, int start, int length) {
    if ((substringNode) == null) {
        com.oracle.truffle.api.CompilerDirectives.transferToInterpreter();
        substringNode = insert(StringPrimitiveNodesFactory.StringSubstringPrimitiveNodeFactory.create(getContext(), getSourceSection(), new org.jruby.truffle.nodes.RubyNode[]{ null , null , null }));
    }
    return substringNode.execute(frame, string, start, length);
}