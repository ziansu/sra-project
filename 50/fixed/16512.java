private short fetchFromMemory(short address) {
    if ((address < 6) || (address > 2048)) {
        mfr = 3;
        mem[4] = pc;
        return 0;
    }else {
        return mem[address];
    }
}