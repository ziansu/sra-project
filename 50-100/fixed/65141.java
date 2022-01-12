public static org.jruby.runtime.builtin.IRubyObject interpretBindingEval(org.jruby.Ruby runtime, java.lang.String file, int lineNumber, org.jruby.ast.Node node, org.jruby.runtime.builtin.IRubyObject self, org.jruby.runtime.Block block) {
    return org.jruby.interpreter.Interpreter.interpretCommonEval(runtime, file, lineNumber, ((org.jruby.ast.RootNode) (node)), self, block);
}