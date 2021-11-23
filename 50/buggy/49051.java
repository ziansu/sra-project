@org.jruby.truffle.nodes.core.array.Specialization(guards = { "isRubySymbol(symbol)" , "isIntArray(array)" , "!isEmptyArray(array)" })
public java.lang.Object injectSymbolIntArray(com.oracle.truffle.api.frame.VirtualFrame frame, org.jruby.truffle.nodes.core.array.RubyArray array, org.jruby.truffle.nodes.core.array.RubyBasicObject symbol, org.jruby.truffle.runtime.NotProvided block) {
    return injectSymbolHelper(frame, org.jruby.truffle.runtime.array.ArrayMirror.reflect(((int[]) (org.jruby.truffle.nodes.core.array.ArrayNodes.getStore(array)))), symbol);
}