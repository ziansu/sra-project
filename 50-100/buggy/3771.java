@java.lang.Override
public void processCommand(int address, int value, jace.apple2e.MOS65C02.MODE addressMode, jace.apple2e.MOS65C02 cpu) {
    if (((value >> (bit)) & 1) != 0) {
        return ;
    }
    if ((cpu.C) != 0) {
        cpu.setProgramCounter(address);
        cpu.addWaitCycles((cpu.pageBoundaryPenalty ? 2 : 1));
    }
}