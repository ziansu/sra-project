public void testMachineNumberQ() {
    check("MachineNumberQ(1.5 + 2.3*I)", "True");
    check("MachineNumberQ(1.5 + 5 *I)", "True");
}