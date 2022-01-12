@org.junit.Test
public void testSimpleLdcw() throws java.io.IOException {
    machine = pad.ijvm.MachineFactory.createIJVMInstance(new java.io.File("files/task4/LoadTest1.ijvm"));
    machine.step();
    assertEquals("The first constant should be 1", machine.topOfStack(), 1);
    machine.step();
    assertEquals("The second constant should be 2", machine.topOfStack(), 2);
    machine.step();
    assertEquals("The third constant shoult be 3", machine.topOfStack(), 3);
    machine.run();
}