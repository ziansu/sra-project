public int adjust(int result) {
    int res = 255 & result;
    if (result == 0)
        setBit(6, true);
    else
        if (result > 127)
            setBit(7, true);
        
    
    if (result > res)
        setFlag("carry", true);
    
    boolean parity = false;
    while (result != 0) {
        if ((result % 2) == 1)
            parity = !parity;
        
        result /= 2;
    } 
    setBit(2, parity);
    return res;
}