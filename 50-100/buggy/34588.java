@org.junit.Test
public void executeDivInstructionZeroDivision() {
    prog1.addInstruction(new businessModel.instructions.Div());
    micro.load(prog1);
    micro.start();
    micro.setRegister("A", 0);
    micro.setRegister("B", 99);
    try {
        micro.execute();
        fail("No Zero Division Exception Throwed");
    } catch (exceptions.IllegalValueException e) {
        assertEquals("Zero Division", e.getMessage());
    }
}