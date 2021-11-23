@org.junit.Test
public void testProcessJmp() throws net.torocraft.minecoprocessors.util.ParseException {
    net.torocraft.minecoprocessors.processor.Processor processor = net.torocraft.minecoprocessors.processor.ProcessorTest.setupTest(0, 0, 0, 0, "jmp test_label");
    processor.processJmp();
    assertRegisters(processor, 0, 0, 0, 0);
    org.junit.Assert.assertEquals(net.torocraft.minecoprocessors.processor.ProcessorTest.TEST_LABEL_ADDRESS, processor.ip);
}