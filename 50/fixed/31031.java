public org.jruby.truffle.runtime.core.RubyException privateMethodError(java.lang.String name, org.jruby.truffle.runtime.core.RubyModule module, com.oracle.truffle.api.nodes.Node currentNode) {
    com.oracle.truffle.api.CompilerAsserts.neverPartOfCompilation();
    return noMethodError(java.lang.String.format("private method `%s' called for %s", name, module.getName()), name, currentNode);
}