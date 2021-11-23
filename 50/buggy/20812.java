@org.junit.Before
public void setUp() {
    memory = new com.rox.emu.mem.SimpleMemory();
    memory.setByteAt(0, 65532);
    memory.setByteAt(0, 65533);
    processor = new com.rox.emu.processor.mos6502.CPU(memory);
    processor.reset();
}