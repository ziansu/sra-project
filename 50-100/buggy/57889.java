@org.junit.Test
public void test_observerNotifiedWhenAddedComponentBreaks() {
    examens.p1_rec_15_16.MachineComposite composite = new examens.p1_rec_15_16.MachineComposite();
    composite.addObserver(graphicInterface);
    org.junit.Assert.assertFalse(graphicInterface.notified);
    examens.p1_rec_15_16.Machine machine = createBrokenMachine();
    composite.addComponent(machine);
    org.junit.Assert.assertFalse(graphicInterface.notified);
    machine.setBroken();
    org.junit.Assert.assertTrue(graphicInterface.notified);
}