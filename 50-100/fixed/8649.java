@org.junit.Test
public void testProcessMov() throws net.torocraft.minecoprocessors.util.ParseException {
    net.torocraft.minecoprocessors.processor.Processor processor = net.torocraft.minecoprocessors.processor.ProcessorTest.setupTest(0, 30, 0, 0, "mov a, b");
    processor.processMov();
    net.torocraft.minecoprocessors.processor.ProcessorTest.assertRegisters(processor, 30, 30, 0, 0);
    processor = net.torocraft.minecoprocessors.processor.ProcessorTest.setupTest(0, 30, 0, 0, "mov a, 51");
    processor.processMov();
    net.torocraft.minecoprocessors.processor.ProcessorTest.assertRegisters(processor, 51, 30, 0, 0);
}