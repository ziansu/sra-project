@org.junit.Test
public void testProcessOr() throws net.torocraft.minecoprocessors.util.ParseException {
    net.torocraft.minecoprocessors.processor.Processor processor = net.torocraft.minecoprocessors.processor.ProcessorTest.setupTest(8, 0, 0, 7, "or d, a");
    processor.processOr();
    net.torocraft.minecoprocessors.processor.ProcessorTest.assertRegisters(processor, 8, 0, 0, 15);
    org.junit.Assert.assertFalse(processor.zero);
    processor = net.torocraft.minecoprocessors.processor.ProcessorTest.setupTest(0, 0, 0, 0, "or d, a");
    processor.processOr();
    net.torocraft.minecoprocessors.processor.ProcessorTest.assertRegisters(processor, 0, 0, 0, 0);
    assert processor.zero;
}