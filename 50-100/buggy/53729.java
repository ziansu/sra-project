@org.junit.Test
public void testProcessMul() throws net.torocraft.minecoprocessors.util.ParseException {
    net.torocraft.minecoprocessors.processor.Processor processor = net.torocraft.minecoprocessors.processor.ProcessorTest.setupTest(255, 2, 0, 0, "mul b");
    processor.processMul();
    assertRegisters(processor, 254, 2, 0, 0);
    org.junit.Assert.assertFalse(processor.zero);
    processor = net.torocraft.minecoprocessors.processor.ProcessorTest.setupTest(5, 0, 0, 2, "mul d");
    processor.processMul();
    assertRegisters(processor, 10, 0, 0, 2);
    org.junit.Assert.assertFalse(processor.zero);
}