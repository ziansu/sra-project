private int getFlag(int flag) {
    int flagVal = 0;
    int flagReg = (registers[Z80.REGISTER_F]) & flag;
    switch (flag) {
        case Z80.FLAG_ZERO :
            flagVal = flagReg >>> 7;
            break;
        case Z80.FLAG_SUBTRACT :
            flagVal = flagReg >>> 6;
            break;
        case Z80.FLAG_HALFCARRY :
            flagVal = flagReg >>> 5;
            break;
        case Z80.FLAG_CARRY :
            flagVal = flagReg >>> 4;
            break;
    }
    return flagVal;
}