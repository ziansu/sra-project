private void jcc(short x, short address, short indirect) {
    short EA = calcEA(x, address, indirect);
    if ((cc[1]) == true) {
        pc = EA;
    }else {
        (pc)++;
    }
}