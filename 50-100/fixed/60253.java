@org.junit.Test
public void parseVariableOperand_noFreeAdd() {
    java.util.List<net.torocraft.minecoprocessors.util.Label> labels = new java.util.ArrayList<>();
    net.torocraft.minecoprocessors.util.ParseException e = null;
    try {
        net.torocraft.minecoprocessors.util.InstructionUtil.parseVariableOperand("", net.torocraft.minecoprocessors.util.InstructionUtilTest.inst(0, 0, 0, 0), "b + 5", 1, labels);
    } catch (net.torocraft.minecoprocessors.util.ParseException ex) {
        e = ex;
    }
    org.junit.Assert.assertNotNull(e);
    org.junit.Assert.assertEquals(InstructionUtil.ERROR_NON_REFERENCE_OFFSET, e.message);
}