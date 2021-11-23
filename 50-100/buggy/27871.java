public org.jruby.compiler.ir.operands.Operand buildRedo(org.jruby.ast.Node node, org.jruby.compiler.ir.IRScope s) {
    if (s instanceof org.jruby.compiler.ir.IRClosure) {
        org.jruby.compiler.ir.IRLoop currLoop = getCurrentLoop();
        if (currLoop != null) {
            s.addInstr(new org.jruby.compiler.ir.instructions.JumpInstr(currLoop.iterStartLabel));
        }else {
            addThreadPollInstrIfNeeded(s);
            s.addInstr(new org.jruby.compiler.ir.instructions.JumpInstr(((org.jruby.compiler.ir.IRClosure) (s)).startLabel));
        }
    }else {
        s.addInstr(new org.jruby.compiler.ir.instructions.ThrowExceptionInstr(org.jruby.compiler.ir.operands.IRException.REDO_LocalJumpError));
    }
    return org.jruby.compiler.ir.operands.Nil.NIL;
}