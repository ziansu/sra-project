@java.lang.Override
public nez.parser.Instruction encodeTlfold(nez.lang.expr.Tlfold p, nez.parser.Instruction next) {
    this.leftedStack.push(true);
    if (this.enabledASTConstruction) {
        nez.debugger.BasicBlock fbb = new nez.debugger.BasicBlock();
        this.builder.pushFailureJumpPoint(fbb);
        this.builder.createImark(p);
        this.builder.createIleftnew(p);
    }
    return null;
}