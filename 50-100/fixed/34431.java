private void jcc(short cc, short x, short address, short indirect) {
    short EA = calcEA(x, address, indirect);
    if ((this.cc[cc]) == true) {
        pc = EA;
    }else {
        (pc)++;
    }
}