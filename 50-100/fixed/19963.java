@org.junit.Test
public void executeDivInstructionCheckingTruncate() {
    prog1.addInstruction(new businessModel.instructions.Div());
    micro.load(prog1);
    micro.start();
    micro.setRegister("A", 99);
    micro.setRegister("B", 50);
    micro.execute();
    assertEquals(0, micro.getRegister("A").getValue(), 0);
    assertEquals(1, micro.getRegister("B").getValue(), 0);
}