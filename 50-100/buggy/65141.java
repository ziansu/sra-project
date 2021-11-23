public static org.jruby.runtime.builtin.IRubyObject interpretBindingEval(org.jruby.Ruby runtime, java.lang.String file, int lineNumber, org.jruby.ast.Node node, org.jruby.runtime.builtin.IRubyObject self, org.jruby.runtime.Block block) {
    org.jruby.ast.RootNode rootNode = ((org.jruby.ast.RootNode) (node));
    org.jruby.parser.StaticScope ss = rootNode.getStaticScope();
    org.jruby.compiler.ir.IRScope containingIRScope = ((org.jruby.parser.IRStaticScope) (ss.getEnclosingScope())).getIRScope();
    return org.jruby.interpreter.Interpreter.interpretCommonEval(runtime, file, lineNumber, rootNode, self, block, ss, containingIRScope);
}