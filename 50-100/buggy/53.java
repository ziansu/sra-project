@org.junit.Test
public void testProcessNot() throws net.torocraft.minecoprocessors.util.ParseException {
    net.torocraft.minecoprocessors.processor.Processor processor = net.torocraft.minecoprocessors.processor.ProcessorTest.setupTest(0, 0, 10, 0, "not c");
    processor.processNot();
    assertRegisters(processor, 0, 0, 245, 0);
    org.junit.Assert.assertFalse(processor.zero);
    processor = net.torocraft.minecoprocessors.processor.ProcessorTest.setupTest(0, 0, 255, 0, "not c");
    processor.processNot();
    assertRegisters(processor, 0, 0, 0, 0);
    assert processor.zero;
}