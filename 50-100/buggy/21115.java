@java.lang.Override
public void visitConnector(org.peg4d.expression.ParsingConnector e) {
    int label = newLabel();
    this.pushFailureJumpPoint();
    writeCode(Instruction.PUSHconnect);
    writeCode(Instruction.PUSHm);
    e.inner.visit(this);
    writeCode(Instruction.COMMIT);
    writeCode(Instruction.LINK, e.index);
    writeJumpCode(Instruction.JUMP, label);
    this.popFailureJumpPoint(e);
    writeCode(Instruction.ABORT);
    writeCode(Instruction.STOREo);
    writeJumpCode(Instruction.JUMP, jumpFailureJump());
    writeLabel(label);
}