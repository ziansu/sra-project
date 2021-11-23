private void str(short r, short x, short address, short indirect) {
    short EA = calcEA(x, address, indirect);
    mar = EA;
    mbr = this.r[r];
    setMem(mbr, mar);
}