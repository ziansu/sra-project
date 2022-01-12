@org.junit.Before
public void setUp() {
    memory = new com.rox.emu.mem.SimpleMemory();
    memory.setByteAt(65532, 0);
    memory.setByteAt(65533, 0);
    processor = new com.rox.emu.processor.mos6502.CPU(memory);
    processor.reset();
}