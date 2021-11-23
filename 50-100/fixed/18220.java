@org.junit.Test
public void testExecCycle() {
    byte[] program = new byte[]{ Instruction.LA.getId() , 0 , 0 , 32 , Instruction.LIT.getId() , 0 , 17 , Instruction.STO.getId() };
    programMemory.store(0, program);
    assertEquals(0, controlUnit.getPc());
    controlUnit.executeCycle();
    assertEquals(4, controlUnit.getPc());
    assertEquals(ControlUnit.MachineState.STOPPED, controlUnit.getMachineState());
}