@java.lang.Override
public generator.Instruction visitReadStat(generator.ReadStat node) {
    generator.Instruction result = new generator.Read(sprockell.types.Address.STANDARD_IO);
    program.addInstruction(result);
    program.addInstruction(new generator.Receive(regs.getReg(node)));
    return result;
}