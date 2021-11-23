public void testMachineNumberQ() {
    check("MachineNumberQ(3.14159265358979324)", "False");
    check("MachineNumberQ(1.5 + 2.3*I)", "True");
    check("MachineNumberQ(2.71828182845904524 + 3.14159265358979324*I)", "False");
    check("MachineNumberQ(1.5 + 3.14159265358979324*I)", "False");
    check("MachineNumberQ(1.5 + 5 *I)", "True");
}