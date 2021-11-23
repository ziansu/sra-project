@java.lang.Override
public void visitRepetition(org.peg4d.expression.ParsingRepetition e) {
    int label = newLabel();
    int end = newLabel();
    this.pushFailureJumpPoint();
    writeLabel(label);
    writeCode(Instruction.PUSHp);
    e.inner.visit(this);
    writeCode(Instruction.REPCOND, end);
    writeJumpCode(Instruction.JUMP, label);
    this.popFailureJumpPoint(e);
    writeCode(Instruction.SUCC);
    writeCode(Instruction.STOREp);
    writeLabel(end);
}