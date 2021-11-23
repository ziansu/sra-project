public int adjust(int result) {
    int res = 255 & result;
    setBit(6, (res == 0));
    setBit(7, (res > 127));
    setFlag("carry", (result > res));
    boolean parity = false;
    while (result != 0) {
        if ((result % 2) == 1)
            parity = !parity;
        
        result /= 2;
    } 
    setBit(2, parity);
    return res;
}