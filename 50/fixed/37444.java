@java.lang.Override
public generator.Instruction visitReadStat(generator.ReadStat node) {
    generator.Instruction result = addInstruction(new generator.Read(sprockell.types.Address.STANDARD_IO));
    addInstruction(new generator.Receive(regs.getReg(node)));
    return result;
}