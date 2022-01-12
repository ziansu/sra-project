private void stx(short x, short address, short indirect) {
    short EA = calcEA(((short) (0)), address, indirect);
    mar = EA;
    mbr = this.x[x];
    cpu.CPU.setMem(mbr, mar);
}