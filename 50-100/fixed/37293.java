@org.junit.Test
public void testProcessDec() throws net.torocraft.minecoprocessors.util.ParseException {
    net.torocraft.minecoprocessors.processor.Processor processor = net.torocraft.minecoprocessors.processor.ProcessorTest.setupTest(10, 0, 0, 0, "dec a");
    processor.processDec();
    net.torocraft.minecoprocessors.processor.ProcessorTest.assertRegisters(processor, 9, 0, 0, 0);
    org.junit.Assert.assertFalse(processor.zero);
    processor = net.torocraft.minecoprocessors.processor.ProcessorTest.setupTest(1, 0, 0, 0, "dec a");
    processor.processDec();
    net.torocraft.minecoprocessors.processor.ProcessorTest.assertRegisters(processor, 0, 0, 0, 0);
    org.junit.Assert.assertTrue(processor.zero);
}