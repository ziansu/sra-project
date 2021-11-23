@org.junit.Test
public void testProcessAnd() throws net.torocraft.minecoprocessors.util.ParseException {
    net.torocraft.minecoprocessors.processor.Processor processor = net.torocraft.minecoprocessors.processor.ProcessorTest.setupTest(31, 2, 0, 0, "and a, b");
    processor.processAnd();
    net.torocraft.minecoprocessors.processor.ProcessorTest.assertRegisters(processor, 2, 2, 0, 0);
    org.junit.Assert.assertFalse(processor.zero);
    processor = net.torocraft.minecoprocessors.processor.ProcessorTest.setupTest(29, 2, 0, 0, "and a, b");
    processor.processAnd();
    net.torocraft.minecoprocessors.processor.ProcessorTest.assertRegisters(processor, 0, 2, 0, 0);
    org.junit.Assert.assertTrue(processor.zero);
}