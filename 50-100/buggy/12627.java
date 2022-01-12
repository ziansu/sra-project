@java.lang.Override
public void enterInstruction(net.rapidasm.antlr.RapidASMParser.InstructionContext ctx) {
    net.rapidasm.structure.RapidStatementBlock block = this.getCurrentBlock();
    this.currentInstructionStatement = new net.rapidasm.structure.RapidInstructionStatement(block, ctx.ALPHANUM().getText());
    this.resetOperands();
    block.addStatement(this.currentInstructionStatement);
}