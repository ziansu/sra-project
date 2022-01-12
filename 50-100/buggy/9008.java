@org.junit.Test
public void testProcessXor() throws net.torocraft.minecoprocessors.util.ParseException {
    net.torocraft.minecoprocessors.processor.Processor processor = net.torocraft.minecoprocessors.processor.ProcessorTest.setupTest(5, 6, 0, 0, "xor a, b");
    processor.processXor();
    assertRegisters(processor, 3, 6, 0, 0);
    org.junit.Assert.assertFalse(processor.zero);
    processor = net.torocraft.minecoprocessors.processor.ProcessorTest.setupTest(5, 5, 0, 0, "xor a, b");
    processor.processXor();
    assertRegisters(processor, 0, 5, 0, 0);
    org.junit.Assert.assertTrue(processor.zero);
}