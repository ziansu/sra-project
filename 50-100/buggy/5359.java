private void addRootMethod() {
    java.lang.String n = (org.jruby.compiler.ir.IRModule.ROOT_METHOD_PREFIX) + (getName());
    rootMethod = new org.jruby.compiler.ir.IRMethod(this, n, false, org.jruby.parser.IRStaticScopeFactory.newIRLocalScope(getLexicalParent().getStaticScope()));
    rootMethod.addInstr(new org.jruby.compiler.ir.instructions.ReceiveSelfInstruction(rootMethod.getSelf()));
    rootMethod.addInstr(new org.jruby.compiler.ir.instructions.ReceiveClosureInstr(rootMethod.getImplicitBlockArg()));
}