@java.lang.Override
public net.jr.jrc.tree.AstNode visitBreak(net.jr.jrc.tree.AstBreak _break) {
    net.jr.jrc.tree.AstNode owner = _break.getOwningBlock();
    if (owner == (ctxStack.peek()._switch)) {
        return new net.jr.jrc.tree.AstGoto(ctxStack.peek().getBreakLabel());
    }else {
        return _break;
    }
}