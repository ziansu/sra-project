@org.junit.Test
public void executeDivInstructionCheckingRegisters() {
    prog1.addInstruction(new businessModel.instructions.Div());
    micro.load(prog1);
    micro.start();
    micro.setRegister("A", 50);
    micro.setRegister("B", 100);
    micro.execute();
    assertEquals(0, micro.getRegister("A").getValue(), 0);
    assertEquals(2, micro.getRegister("B").getValue(), 0);
}