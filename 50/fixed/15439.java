private void loadi() {
    MAR = MBR;
    MBR = memory.read(MAR);
    AC = MBR;
}