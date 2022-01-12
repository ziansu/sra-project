@java.lang.Override
protected cpu.disassembler.Instruction uncheckedDecodeInstruction(util.ByteScanner scanner) {
    byte command = scanner.readByte();
    short addr = ((short) (65280 + ((scanner.readByte()) & 255)));
    cpu.disassembler.SettableValueContainer<java.lang.Byte> container = new cpu.disassembler.BytePointer(addr);
    return (command & 255) == 224 ? new cpu.disassembler.MemoryInstructions.Ld8Instruction(container, Register8.A) : new cpu.disassembler.MemoryInstructions.Ld8Instruction(Register8.A, container);
}