public boolean enterCode(float real, float imag) {
    if ((nCode) < (N)) {
        realCode[nCode] = real;
        imagCode[nCode] = imag;
        (nCode)++;
    }else
        return true;
    
    return false;
}